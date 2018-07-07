package at.triply.wcapi.converters

import at.triply.wcapi.model.Entity
import retrofit2.Response

internal object CollectionResponseConverter {
    const val LINK = "LINK"
    const val TOTAL = "X-WP-Total"
    const val TOTAL_PAGES = "X-WP-TotalPages"

    fun <T> convert(response: Response<List<T>>): CollectionResponse<T> where T : Entity = response.headers().run {
        val link = get(LINK)
        val total = get(TOTAL)
        val totalPages = get(TOTAL_PAGES)

        CollectionResponse(total!!.toInt(), totalPages!!.toInt(), link, response.body()!!)
    }
}