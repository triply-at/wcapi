package at.triply.wcapi.model


class FeeLine(val amount: String,
              val total: String,
              val tax_class: String,
              val tax_status: String,
              val name: String,
              val meta_data: List<MetaData>,
              val taxes: List<TaxLine>,
              val id: Int,
              val total_tax: String)