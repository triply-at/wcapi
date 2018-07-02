package at.triply.wcapi.model

data class BillingInformation(val country: String,
                              val city: String,
                              val phone: String,
                              val address_1: String,
                              val address_2: String,
                              val postcode: String,
                              val lastName: String,
                              val company: String,
                              val state: String,
                              val firstName: String,
                              val email: String)