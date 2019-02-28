package at.triply.wcmodel

import at.triply.wcmodel.converters.LocalDateTimeConverter
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.time.LocalDateTime

object WcModel {
    fun getGson() = GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .registerTypeAdapter(TypeToken.get(LocalDateTime::class.java).type, LocalDateTimeConverter())
            .create()
}