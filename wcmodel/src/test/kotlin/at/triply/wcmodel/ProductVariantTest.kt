package at.triply.wcmodel

import at.triply.wcmodel.model.ProductVariation
import org.junit.Test

class ProductVariantTest {

    @Test
    fun testConvertProductVariationFromJson() {
        val json = javaClass.getResourceAsStream("/productVariation.json")
        val variation = WcModel.getGson().fromJson<ProductVariation>(json.reader(), ProductVariation::class.java)

        println(variation)
    }
}