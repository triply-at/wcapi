package at.triply.wcapi

import at.triply.wcapi.converters.CollectionResponse
import at.triply.wcmodel.model.Entity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE_TIME

fun LocalDateTime.toStringDate(): String {
    return DATE_TIME_FORMATTER.format(this)
}

fun <T> List<CollectionResponse<T>>.allItems(): List<T> where T : Entity = flatMap(CollectionResponse<T>::collection)