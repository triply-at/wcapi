package at.triply.wcapi

import org.junit.Test

class GetTaxesTest : ApiTest() {

    @Test
    fun testSimpleRestCall() {
        val taxes = wcApi.getTaxes()?.blockingGet()
        assert(taxes!!.total > 0) { "There should be more than 0 taxes" }
    }

}