package at.triply.wcapi

import java.util.*

data class Config(val url: String, val key: String, val secret: String) {
    companion object {
        fun fromProps(props: Properties): Config {
            val url = props["url"] as String
            val key = props["key"] as String
            val secret = props["secret"] as String

            return Config(url, key, secret)
        }
    }
}