package at.triply.wcapi.converters

/**
 * Represents Links in Collection responses from the WooCommerce API.
 * HeaderLinks are sent as text and usually have the form of:
 *
 * <pre>
 * {@code
 * <https://url/wp-json/wc/v2/orders?product=1116&consumer_key=key&consumer_secret=secret&page=1&dp=2>; rel="prev", <https://url/wp-json/wc/v2/orders?product=1116&consumer_key=key&consumer_secret=secret&page=3&dp=2>; rel="next"
 * }
 * </pre>
 */
data class HeaderLink(val link: String, val rel: Relation) {
    enum class Relation(val s: kotlin.String) {
        NEXT("""rel="next""""),
        PREV("""rel="prev"""")
    }
}