package at.triply.wcmodel.model

class TaxLine(val rateId: Int,
              val metaData: List<String>,
              val id: Int,
              val label: String,
              val rateCode: String,
              val compound: Boolean,
              val shippingTaxTotal: String)