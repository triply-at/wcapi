package at.triply.wcapi.model

import com.google.gson.annotations.SerializedName

data class Product(
        val id: Int,
        val name: String,
        val slug: String,
        val permalink: String,
        @SerializedName("date_created")
        val dateCreated: String,
        @SerializedName("date_created_gmt")
        val dateCreatedGmt: String,
        @SerializedName("date_modified")
        val dateModified: String,
        @SerializedName("date_modified_gmt")
        val dateModifiedGmt: String,
        val type: String,
        val status: String,
        val featured: Boolean,
        @SerializedName("catalog_visibility")
        val catalogVisibility: String,
        val description: String,
        @SerializedName("short_description")
        val shortDescription: String,
        val sku: String,
        val price: String,
        @SerializedName("regular_price")
        val regularPrice: String,
        @SerializedName("sale_price")
        val salePrice: String,
        @SerializedName("date_on_sale_from")
        val dateOnSaleFrom: Any?,
        @SerializedName("date_on_sale_from_gmt")
        val dateOnSaleFromGmt: Any?,
        @SerializedName("date_on_sale_to")
        val dateOnSaleTo: Any?,
        @SerializedName("date_on_sale_to_gmt")
        val dateOnSaleToGmt: Any?,
        @SerializedName("price_html")
        val priceHtml: String,
        @SerializedName("on_sale")
        val onSale: Boolean,
        val purchasable: Boolean,
        @SerializedName("total_sales")
        val totalSales: Int,
        val virtual: Boolean,
        val downloadable: Boolean,
        val downloads: List<Any>,
        @SerializedName("download_limit")
        val downloadLimit: Int,
        @SerializedName("download_expiry")
        val downloadExpiry: Int,
        @SerializedName("external_url")
        val externalUrl: String,
        @SerializedName("button_text")
        val buttonText: String,
        @SerializedName("tax_status")
        val taxStatus: String,
        @SerializedName("tax_class")
        val taxClass: String,
        @SerializedName("manage_stock")
        val manageStock: Boolean,
        @SerializedName("stock_quantity")
        val stockQuantity: Int,
        @SerializedName("in_stock")
        val inStock: Boolean,
        val backorders: String,
        @SerializedName("backorders_allowed")
        val backordersAllowed: Boolean,
        val backordered: Boolean,
        @SerializedName("sold_individually")
        val soldIndividually: Boolean,
        val weight: String,
        val dimensions: Dimensions,
        @SerializedName("shipping_required")
        val shippingRequired: Boolean,
        @SerializedName("shipping_taxable")
        val shippingTaxable: Boolean,
        @SerializedName("shipping_class")
        val shippingClass: String,
        @SerializedName("shipping_class_id")
        val shippingClassId: Int,
        @SerializedName("reviews_allowed")
        val reviewsAllowed: Boolean,
        @SerializedName("average_rating")
        val averageRating: String,
        @SerializedName("rating_count")
        val ratingCount: Int,
        @SerializedName("related_ids")
        val relatedIds: List<Int>,
        @SerializedName("upsell_ids")
        val upsellIds: List<Any>,
        @SerializedName("cross_sell_ids")
        val crossSellIds: List<Any>,
        @SerializedName("parent_id")
        val parentId: Int,
        @SerializedName("purchase_note")
        val purchaseNote: String,
        val categories: List<Category>,
        val tags: List<Any>,
        val images: List<Image>,
        val attributes: List<Attribute>,
        @SerializedName("default_attributes")
        val defaultAttributes: List<DefaultAttribute>,
        val variations: List<Int>,
        @SerializedName("grouped_products")
        val groupedProducts: List<Any>,
        @SerializedName("menu_order")
        val menuOrder: Int,
        @SerializedName("meta_data")
        val metaData: List<MetaData>,
        @SerializedName("_links")
        val links: ProductLinks
): Entity