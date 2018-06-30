package at.triply.wcapi.model

class LineItem(val quantity: Int,
               val tax_class: String,
               val taxes: List<Taxes>,
               val total_tax: String,
               val total: String,
               val price: Double,
               val subtotal: String,
               val variation_id: Int,
               val product_id: Int,
               val meta_data: List<MetaData>?,
               val name: String,
               val id: Int,
               val sku: String? = null,
               val subtotal_tax: String)