package at.triply.wcapi

import org.junit.Test
import java.util.*


class GetProductsTest {

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
        val products = wcApi.getProducts().blockingGet()
        println("Amount: ${products.total}")
        println(products.collection.first())
        assert(products.collection.all { it.slug.isNotBlank() }) {
            "There is no slug at product ${products.collection.first { it.slug.isBlank() }.id}"
        }
    }

    @Test
    fun testProductsBySlug() {
        val productsWithSlug = wcApi.getProducts(slug = "test").blockingGet()
        assert(productsWithSlug.total == 1) { "There should only be one product with the slug \"test\""}
    }
}