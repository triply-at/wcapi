package at.triply.wcapi

object Constants {
    enum class Context(val s: String) {
        VIEW("view"),
        EDIT("edit")
    }

    enum class OrderOptions(val s: String) {
        DESC("desc"), ASC("asc")
    }

    enum class OrderByOptions(val s: String) {
        DATE("date"),
        ID("id"),
        INCLUDE("include"),
        TITLE("title"),
        SLUG("slug")
    }

    enum class OrderStatus(val s: String) {
        ANY("any"),
        PENDING("pending"),
        PROCESSING("processing"),
        ON_HOLD("on-hold"),
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        REFUNDED("refunded"),
        FAILED("failed")
    }

    enum class ProductStatus(val s: String) {
        ANY("any"),
        DRAFT("draft"),
        PENDING("pending"),
        PRIVATE("private"),
        PUBLISH("publish")
    }

    enum class ProductType(val s: String) {
        SIMPLE("simple"),
        GROUPED("grouped"),
        EXTERNAL("external"),
        VARIABLE("variable")
    }

    enum class TaxClass(val s: String) {
        STANDARD("standard"),
        REDUCED_RATE("reduced_rate"),
        ZERO_RATE("zero_rate")
    }
}