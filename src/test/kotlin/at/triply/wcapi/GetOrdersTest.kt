package at.triply.wcapi

import org.junit.Ignore
import org.junit.Test


@Ignore
class GetOrdersTest : ApiTest() {
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

    @Test
    fun testGetAllOrders() {
        val orderSingle = wcApi.getOrders(pageSize = 100)
        val orders = wcApi.getAllOrders(orderSingle)
                .toList()
                .blockingGet()

        val totalOrders = orders.first().total
        val retrievedOrders = orders.allItems().size
        assert(totalOrders == retrievedOrders) { "Total size sent by server does not equal number of items (expected $totalOrders but got $retrievedOrders" }

    }
}