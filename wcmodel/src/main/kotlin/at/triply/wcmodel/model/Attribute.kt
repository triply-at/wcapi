package at.triply.wcmodel.model

data class Attribute(
        val id: Int,
        val name: String,
        val position: Int,
        val visible: Boolean,
        val variation: Boolean,
        val options: List<String>
)