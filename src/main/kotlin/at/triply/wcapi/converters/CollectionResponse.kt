package at.triply.wcapi.converters

import at.triply.wcapi.model.Entity

data class CollectionResponse<T>(
        val total: Int,
        val totalPages: Int,
        val linkText: String?,
        val collection: List<T>
) where T : Entity