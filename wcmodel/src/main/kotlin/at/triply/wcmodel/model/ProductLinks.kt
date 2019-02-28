package at.triply.wcmodel.model

data class ProductLinks(
        val self: List<SelfLink>,
        val collection: List<CollectionLink>
)