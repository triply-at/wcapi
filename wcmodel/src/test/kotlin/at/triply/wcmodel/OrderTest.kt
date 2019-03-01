package at.triply.wcmodel

import at.triply.wcmodel.model.Order
import org.junit.Test

class OrderTest {
    @Test
    fun testNothing() {
        val order =
                WcModel.getGson().fromJson<Order>(javaClass.getResourceAsStream("/test_order.json").reader().readText(), Order::class.java)
        println(order)
    }
}