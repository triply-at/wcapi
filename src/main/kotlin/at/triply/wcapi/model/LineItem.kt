package at.triply.wcapi.model

data class LineItem(val quantity: Int,
                    val taxClass: String,
                    val taxes: List<Taxes>,
                    val totalTax: String,
                    val total: String,
                    val price: Double,
                    val subtotal: String,
                    val variationId: Int,
                    val productId: Int,
                    val metaData: List<MetaData>?,
                    val name: String,
                    val id: Int,
                    val sku: String? = null,
                    val subtotalTax: String)