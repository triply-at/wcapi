package at.triply.wcapi.converters

import at.triply.wcmodel.model.Entity
import retrofit2.Response

internal object CollectionResponseConverter {
    const val LINK = "LINK"
    const val TOTAL = "X-WP-Total"
    const val TOTAL_PAGES = "X-WP-TotalPages"

    fun <T> convert(response: Response<List<T>>): CollectionResponse<T> where T : Entity = response.headers().run {
        val linkString = get(LINK)
        val links = linkString?.run(CollectionResponseConverter::stringToLinks)
        val total = get(TOTAL)
        val totalPages = get(TOTAL_PAGES)

        CollectionResponse(total!!.toInt(), totalPages!!.toInt(), links, response.body()!!)
    }

    /**
     * Converts the LINK header value from a WooCommerce Collection response into a list HeaderLinks.
     *
     * @see at.triply.wcapi.converters.HeaderLink
     */
    private fun stringToLinks(string: String): List<HeaderLink> = string.split(", ").mapNotNull {
        try {
            val (first, second) = it.split("; ")
            HeaderLink(
                    first.toCharArray().drop(1).dropLast(1).joinToString(separator = ""),
                    HeaderLink.Relation.values().first { it.s == second }
            )

        } catch (exception: Exception) {
            null
        }
    }
}