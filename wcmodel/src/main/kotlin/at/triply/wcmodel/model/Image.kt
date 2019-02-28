package at.triply.wcmodel.model

import com.google.gson.annotations.SerializedName

data class Image(
        val id: Int,
        @SerializedName("date_created")
        val dateCreated: String,
        @SerializedName("date_created_gmt")
        val dateCreatedGmt: String,
        @SerializedName("date_modified")
        val dateModified: String,
        @SerializedName("date_modified_gmt")
        val dateModifiedGmt: String,
        val src: String,
        val name: String,
        val alt: String,
        val position: Int
)