package at.triply.wcapi.converters

import at.triply.wcmodel.model.Entity

data class CollectionResponse<T>(
        val total: Int,
        val totalPages: Int,
        val links: List<HeaderLink>?,
        val collection: List<T>
) where T : Entity