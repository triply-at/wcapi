package at.triply.wcapi

import at.triply.wcapi.converters.CollectionResponse
import at.triply.wcapi.converters.CollectionResponseConverter
import at.triply.wcapi.model.Order
import at.triply.wcapi.model.Product
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.time.LocalDateTime
import java.util.*

class WooCommerceApi(private val config: Config) {

    private val wooCommerceService: WooCommerceService

    init {
        val gson = GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create()
        val okHttpClient = OkHttpClient.Builder().build()
        val retrofit = Retrofit.Builder()
                .baseUrl(config.url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()

        wooCommerceService = retrofit.create(WooCommerceService::class.java)
    }

    fun getOrders(context: Constants.Context? = null,
                  page: Int? = null,
                  pageSize: Int? = null,
                  search: String? = null,
                  after: LocalDateTime? = null,
                  before: LocalDateTime? = null,
                  exclude: Array<Int>? = null,
                  include: Array<Int>? = null,
                  offset: Int? = null,
                  order: Constants.OrderOptions? = null,
                  orderBy: Constants.OrderByOptions? = null,
                  parent: Array<Int>? = null,
                  parentExcludes: Array<Int>? = null,
                  status: Constants.Status? = null,
                  customer: Int? = null,
                  product: Int? = null,
                  dp: Int? = null): Single<CollectionResponse<Order>> {
        return wooCommerceService
                .getOrders(config.key,
                        config.secret,
                        context?.s,
                        page,
                        pageSize,
                        search,
                        after?.toStringDate(),
                        before?.toStringDate(),
                        exclude,
                        include,
                        offset,
                        order?.s,
                        orderBy?.s,
                        parent,
                        parentExcludes,
                        status?.s,
                        customer,
                        product,
                        dp)
                .map { CollectionResponseConverter.convert(it) }
    }

    fun getProducts(): Single<CollectionResponse<Product>> = wooCommerceService.getProducts(config.key, config.secret).map {
        CollectionResponseConverter.convert(it)
    }
}
