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

    @Test
    fun testOrderSearch() {
        val orders = wcApi.getOrders(search = "tidh)").blockingGet()
        println(orders.collection[0])
        println(orders.total)
    }

    @Test
    fun testOrdersWithProduct() {
        val orders = wcApi.getOrders(product = 1622).blockingGet()
        println(orders.collection[0])
        println(orders.total)
    }
}