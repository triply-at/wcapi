package at.triply.wcmodel.model

import com.google.gson.annotations.SerializedName

data class ProductVariation(
        @SerializedName("_links")
        val links: VariationLinks,
        val attributes: List<VariationAttribute>,
        val backordered: Boolean,
        val backorders: String,
        @SerializedName("backorders_allowed")
        val backordersAllowed: Boolean,
        @SerializedName("date_created")
        val dateCreated: String,
        @SerializedName("date_created_gmt")
        val dateCreatedGmt: String,
        @SerializedName("date_modified")
        val dateModified: String,
        @SerializedName("date_modified_gmt")
        val dateModifiedGmt: String,
        @SerializedName("date_on_sale_from")
        val dateOnSaleFrom: Any?,
        @SerializedName("date_on_sale_from_gmt")
        val dateOnSaleFromGmt: Any?,
        @SerializedName("date_on_sale_to")
        val dateOnSaleTo: Any?,
        @SerializedName("date_on_sale_to_gmt")
        val dateOnSaleToGmt: Any?,
        val description: String,
        val dimensions: Dimensions,
        @SerializedName("download_expiry")
        val downloadExpiry: Int,
        @SerializedName("download_limit")
        val downloadLimit: Int,
        val downloadable: Boolean,
        val downloads: List<Any>,
        val id: Int,
        val image: Image,
        @SerializedName("in_stock")
        val inStock: Boolean,
        @SerializedName("manage_stock")
        val manageStock: String,
        @SerializedName("menu_order")
        val menuOrder: Int,
        @SerializedName("meta_data")
        val metaData: List<Any>,
        @SerializedName("on_sale")
        val onSale: Boolean,
        val permalink: String,
        val price: String,
        val purchasable: Boolean,
        @SerializedName("regular_price")
        val regularPrice: String,
        @SerializedName("sale_price")
        val salePrice: String,
        @SerializedName("shipping_class")
        val shippingClass: String,
        @SerializedName("shipping_class_id")
        val shippingClassId: Int,
        val sku: String,
        @SerializedName("stock_quantity")
        val stockQuantity: Int,
        @SerializedName("tax_class")
        val taxClass: String,
        @SerializedName("tax_status")
        val taxStatus: String,
        val virtual: Boolean,
        val visible: Boolean,
        val weight: String
) : Entity