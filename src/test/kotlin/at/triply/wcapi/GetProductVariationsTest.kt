package at.triply.wcapi

import org.junit.Ignore
import org.junit.Test

class GetProductVariationsTest : ApiTest() {

    @Test
    fun getAllProductVariationsTest() {
        val response = wcApi.getProductVariations(4125)
                .blockingGet()

        println(response.total)
    }
}