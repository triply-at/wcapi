package at.triply.wcapi

import at.triply.wcapi.converters.CollectionResponse
import at.triply.wcapi.converters.CollectionResponseConverter
import at.triply.wcapi.model.Entity
import at.triply.wcapi.model.Order
import at.triply.wcapi.model.Product
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import io.reactivex.Observable
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.time.LocalDateTime

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
                  status: Constants.OrderStatus? = null,
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

    fun getProducts(context: Constants.Context? = null,
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
                    slug: String? = null,
                    status: Constants.ProductStatus? = null,
                    type: Constants.ProductType? = null,
                    sku: String? = null,
                    featured: Boolean? = null,
                    category: Int? = null,
                    tag: Int? = null,
                    shippingClass: Int? = null,
                    attribute: String? = null,
                    attributeTerm: Int? = null,
                    taxClass: Constants.TaxClass? = null,
                    inStock: Boolean? = null,
                    onSale: Boolean? = null,
                    minPrice: Double? = null,
                    maxPrice: Double? = null): Single<CollectionResponse<Product>> = wooCommerceService
            .getProducts(config.key,
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
                    slug,
                    status?.s,
                    type?.s,
                    sku,
                    featured,
                    category?.toString(),
                    tag?.toString(),
                    shippingClass?.toString(),
                    attribute,
                    attributeTerm?.toString(),
                    taxClass?.s,
                    inStock,
                    onSale,
                    minPrice?.toString(),
                    maxPrice?.toString()
            ).map {
                CollectionResponseConverter.convert(it)
            }

    fun getAllProducts(oldResponse: Single<CollectionResponse<Product>>): Observable<CollectionResponse<Product>> =
            oldResponse.toObservable().flatMap { cr ->
                val observables = mutableListOf(Observable.just(cr))
                observables.addAll((2..cr.totalPages).mapNotNull {
                    val link = cr.links?.first()?.link?.run { this + "&${QueryParams.PAGE}=$it" }
                            ?: return@mapNotNull null
                    wooCommerceService.getProductCollectionFromLink(link).map { CollectionResponseConverter.convert(it) }
                })
                Observable.merge(observables)
            }
    
    fun getAllOrders(oldResponse: Single<CollectionResponse<Order>>): Observable<CollectionResponse<Order>> =
            oldResponse.toObservable().flatMap { cr ->
                val observables = mutableListOf(Observable.just(cr))
                observables.addAll((2..cr.totalPages).mapNotNull {
                    val link = cr.links?.first()?.link?.run { this + "&${QueryParams.PAGE}=$it" }
                            ?: return@mapNotNull null
                    wooCommerceService.getOrderCollectionFromLink(link).map { CollectionResponseConverter.convert(it) }
                })
                Observable.merge(observables)
            }
}
