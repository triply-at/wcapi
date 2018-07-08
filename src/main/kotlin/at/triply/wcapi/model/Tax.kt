package at.triply.wcapi.model

import com.google.gson.annotations.SerializedName

data class Tax(val id: Int,
               val country: String,
               val state: String,
               val postcode: String,
               val city: String,
               val rate: String,
               val name: String,
               val priority: Int,
               val compound: Boolean,
               val shipping: Boolean,
               val order: Int,
               @SerializedName("class")
               val clazz: String
) : Entity