package at.triply.wcapi.model

data class ProductLinks(
        val self: List<SelfLink>,
        val collection: List<CollectionLink>
)