package at.triply.wcmodel

import at.triply.wcmodel.model.Order
import org.junit.Test

class Test {
    //TODO: Test converting stuff from and to json with hardcoded json from wc rest service
    @Test
    fun testNothing() {
        println("yes")
        val order =
                WcModel.getGson().fromJson<Order>(javaClass.getResourceAsStream("/test_order.json").reader().readText(), Order::class.java)
        println(order)
    }
}