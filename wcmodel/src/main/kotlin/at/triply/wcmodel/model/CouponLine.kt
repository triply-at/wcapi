package at.triply.wcmodel.model

data class CouponLine(val id: Int,
                      val code: String,
                      val discount: String,
                      val discountTax: String,
                      val metaData: List<MetaData>)