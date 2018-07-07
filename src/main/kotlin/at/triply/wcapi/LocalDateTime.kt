package at.triply.wcapi

import at.triply.wcapi.converters.CollectionResponse
import at.triply.wcapi.model.Entity
import java.time.LocalDateTime

fun LocalDateTime.toStringDate(): String {
    return QueryParams.dateTimeFormatter.format(this)
}

fun <T> List<CollectionResponse<T>>.allItems(): List<T> where T : Entity = flatMap(CollectionResponse<T>::collection)