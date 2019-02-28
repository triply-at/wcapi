package at.triply.wcmodel.model


data class FeeLine(val amount: String,
                   val total: String,
                   val taxClass: String,
                   val taxStatus: String,
                   val name: String,
                   val metaData: List<MetaData>,
                   val taxes: List<Taxes>,
                   val id: Int,
                   val totalTax: String)