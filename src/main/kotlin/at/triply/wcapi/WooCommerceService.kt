package at.triply.wcapi

import at.triply.wcapi.model.Order
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WooCommerceService {

    @GET("orders")
    fun getOrders(@Query(Constants.KEY) key: String, @Query(Constants.SECRET) secret: String): Single<List<Order>>
}