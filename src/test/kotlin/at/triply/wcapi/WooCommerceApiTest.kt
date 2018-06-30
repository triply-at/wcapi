package at.triply.wcapi

import org.junit.Before
import org.junit.Test
import java.util.*


class GetOrdersTest {

    val config: Config
    val wcApi: WooCommerceApi

    init {
        val props = Properties()
        val storedProps = javaClass.getResource("/wcapi.properties").openStream()
        props.load(storedProps)
        config = Config.fromProps(props)
        wcApi = WooCommerceApi(config)
    }

    @Test
    fun testSimpleRestCall() {
        println(wcApi.getOrders().blockingGet())
    }
}