package at.triply.wcapi.model

data class Attribute(
        val id: Int,
        val name: String,
        val position: Int,
        val visible: Boolean,
        val variation: Boolean,
        val options: List<String>
)