package at.triply.wcapi

import at.triply.wcapi.model.Order
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WooCommerceApi(private val config: Config) {

    private val wooCommerceService: WooCommerceService

    init {
        val gson = Gson()
        val okHttpClient = OkHttpClient.Builder().build()
        val retrofit = Retrofit.Builder()
                .baseUrl(config.url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()

        wooCommerceService = retrofit.create(WooCommerceService::class.java)
    }

    fun getOrders(): Single<List<Order>> {
        return wooCommerceService.getOrders(config.key, config.secret)
    }
}