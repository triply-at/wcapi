package at.triply.wcapi

import org.junit.Test
import java.util.*

class GetTaxesTest {

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
        val taxes = wcApi.getTaxes().blockingGet()
        assert(taxes.total > 0) { "There should be more than 0 taxes" }
    }

}