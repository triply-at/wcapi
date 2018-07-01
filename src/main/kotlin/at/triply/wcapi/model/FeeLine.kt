package at.triply.wcapi.model


data class FeeLine(val amount: String,
              val total: String,
              val taxClass: String,
              val taxStatus: String,
              val name: String,
              val metaData: List<MetaData>,
              val taxes: List<TaxLine>,
              val id: Int,
              val totalTax: String)