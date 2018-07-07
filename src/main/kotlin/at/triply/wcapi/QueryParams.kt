package at.triply.wcapi

import java.time.format.DateTimeFormatter

internal object QueryParams {

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
    const val OFFSET = "offset"
    const val ORDER = "order"
    const val ORDER_BY = "orderby"
    const val PARENT = "parent"
    const val PARENT_EXCLUDE = "parent_exclude"
    const val STATUS = "status"
    const val CUSTOMER = "customer"
    const val PRODUCT = "product"
    const val DECIMAL_POINTS = "dp"
    const val SLUG = "slug"
    const val TYPE = "type"
    const val SKU = "sku"
    const val FEATURED = "featured"
    const val CATEGORY = "category"
    const val TAG = "tag"
    const val SHIPPING_CLASS = "shipping_class"
    const val ATTRIBUTE = "attribute"
    const val ATTRIBUTE_TERM = "attribute_term"
    const val TAX_CLASS = "tax_class"
    const val IN_STOCK = "in_stock"
    const val ON_SALE = "on_sale"
    const val MIN_PRICE = "min_price"
    const val MAX_PRICE = "max_price"

    val dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME
}