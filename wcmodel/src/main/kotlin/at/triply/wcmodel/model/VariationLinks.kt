package at.triply.wcmodel.model

data class VariationLinks(
        val collection: List<CollectionLink>,
        val self: List<SelfLink>,
        val up: List<Up>
)