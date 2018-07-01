package at.triply.wcapi.model

class TaxLine(val taxTotal: String,
              val rateId: Int,
              val meta_data: List<String>,
              val id: Int,
              val label: String,
              val rateCode: String,
              val compound: Boolean,
              val shippingTaxTotal: String)