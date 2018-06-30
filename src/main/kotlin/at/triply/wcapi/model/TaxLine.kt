package at.triply.wcapi.model

class TaxLine(val tax_total: String,
              val rate_id: Int,
              val meta_data: List<String>,
              val id: Int,
              val label: String,
              val rate_code: String,
              val compound: Boolean,
              val shipping_tax_total: String)