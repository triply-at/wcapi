package at.triply.wcapi

import java.util.*

open class ApiTest {

    val config: Config
    val wcApi: WooCommerceApi

    init {
        val props = Properties()
        val storedProps = javaClass.getResource("/wcapi.properties").openStream()
        props.load(storedProps)
        config = Config.fromProps(props)
        wcApi = WooCommerceApi(config)
    }
}