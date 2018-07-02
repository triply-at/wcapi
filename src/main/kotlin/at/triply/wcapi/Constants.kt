package at.triply.wcapi

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import javax.swing.text.DateFormatter

object Constants {

    const val KEY = "consumer_key"
    const val SECRET = "consumer_secret"
    const val PAGE_SIZE = "per_page"
    const val PAGE = "page"
    const val CONTEXT = "context"
    const val SEARCH = "search"
    const val AFTER = "after"
    const val BEFORE = "before"
    const val INCLUDE = "include"
    const val EXCLUDE = "exclude"
    const val OFFSET= "offset"
    const val ORDER = "order"
    const val ORDERBY = "orderby"
    const val PARENT = "parent"
    const val PARENT_EXCLUDE = "parent_exclude"
    const val STATUS = "status"
    const val CUSTOMER = "customer"
    const val PRODUCT = "product"
    const val DECIMAL_POINTS = "dp"

    enum class Context(val s: String) {
        VIEW("view"),
        EDIT("edit")
    }

    enum class OrderOptions(val s: String) {
        DESC("desc"),ASC("asc")
    }

    enum class OrderByOptions(val s: String) {
        DATE("date"),
        ID("id"),
        INCLUDE("include"),
        TITLE("title"),
        SLUG("slug")
    }

    enum class Status(val s: String) {
        ANY("any"),
        PENDING("pending"),
        PROCESSING("processing"),
        ON_HOLD("on-hold"),
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        REFUNDED("refunded"),
        FAILED("failed")
    }

    val dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME
}