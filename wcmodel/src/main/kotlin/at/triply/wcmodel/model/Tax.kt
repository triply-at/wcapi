package at.triply.wcmodel.model
import com.google.gson.annotations.SerializedName


data class Tax(
    val city: String,
    @SerializedName("class")
    val clazz: String,
    val compound: Boolean,
    val country: String,
    val id: Int,
    val name: String,
    val order: Int,
    val postcode: String,
    val priority: Int,
    val rate: String,
    val shipping: Boolean,
    val state: String
): Entity