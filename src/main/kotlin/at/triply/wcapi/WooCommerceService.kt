package at.triply.wcapi

import at.triply.wcapi.model.Order
import at.triply.wcapi.model.Product
import at.triply.wcapi.model.Tax
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface WooCommerceService {

    @GET("orders")
    fun getOrders(@Query(QueryParams.KEY) key: String,
                  @Query(QueryParams.SECRET) secret: String,
                  @Query(QueryParams.CONTEXT) context: String?,
                  @Query(QueryParams.PAGE) page: Int?,
                  @Query(QueryParams.PAGE_SIZE) pageSize: Int?,
                  @Query(QueryParams.SEARCH) search: String?,
                  @Query(QueryParams.AFTER) after: String?,
                  @Query(QueryParams.BEFORE) before: String?,
                  @Query(QueryParams.EXCLUDE) exclude: Array<Int>?,
                  @Query(QueryParams.INCLUDE) include: Array<Int>?,
                  @Query(QueryParams.OFFSET) offset: Int?,
                  @Query(QueryParams.ORDER) order: String?,
                  @Query(QueryParams.ORDER_BY) orderBy: String?,
                  @Query(QueryParams.PARENT) parent: Array<Int>?,
                  @Query(QueryParams.PARENT_EXCLUDE) parentExclude: Array<Int>?,
                  @Query(QueryParams.STATUS) status: String?,
                  @Query(QueryParams.CUSTOMER) customer: Int?,
                  @Query(QueryParams.PRODUCT) product: Int?,
                  @Query(QueryParams.DECIMAL_POINTS) decimalPoints: Int?): Single<Response<List<Order>>>

    @GET("products")
    fun getProducts(@Query(QueryParams.KEY) key: String,
                    @Query(QueryParams.SECRET) secret: String,
                    @Query(QueryParams.CONTEXT) context: String?,
                    @Query(QueryParams.PAGE) page: Int?,
                    @Query(QueryParams.PAGE_SIZE) pageSize: Int?,
                    @Query(QueryParams.SEARCH) search: String?,
                    @Query(QueryParams.AFTER) after: String?,
                    @Query(QueryParams.BEFORE) before: String?,
                    @Query(QueryParams.EXCLUDE) exclude: Array<Int>?,
                    @Query(QueryParams.INCLUDE) include: Array<Int>?,
                    @Query(QueryParams.OFFSET) offset: Int?,
                    @Query(QueryParams.ORDER) order: String?,
                    @Query(QueryParams.ORDER_BY) orderBy: String?,
                    @Query(QueryParams.PARENT) parent: Array<Int>?,
                    @Query(QueryParams.PARENT_EXCLUDE) parentExclude: Array<Int>?,
                    @Query(QueryParams.SLUG) slug: String?,
                    @Query(QueryParams.STATUS) status: String?,
                    @Query(QueryParams.TYPE) type: String?,
                    @Query(QueryParams.SKU) sku: String?,
                    @Query(QueryParams.FEATURED) featured: Boolean?,
                    @Query(QueryParams.CATEGORY) category: String?,
                    @Query(QueryParams.TAG) tag: String?,
                    @Query(QueryParams.SHIPPING_CLASS) shippingClass: String?,
                    @Query(QueryParams.ATTRIBUTE) attribute: String?,
                    @Query(QueryParams.ATTRIBUTE_TERM) attributeTerm: String?,
                    @Query(QueryParams.TAX_CLASS) taxClass: String?,
                    @Query(QueryParams.IN_STOCK) inStock: Boolean?,
                    @Query(QueryParams.ON_SALE) onSale: Boolean?,
                    @Query(QueryParams.MIN_PRICE) minPrice: String?,
                    @Query(QueryParams.MAX_PRICE) maxPrice: String?
    ): Single<Response<List<Product>>>

    @GET("taxes")
    fun getTaxes(@Query(QueryParams.KEY) key: String,
                 @Query(QueryParams.SECRET) secret: String,
                 @Query(QueryParams.CONTEXT) context: String?,
                 @Query(QueryParams.PAGE) page: Int?,
                 @Query(QueryParams.PAGE_SIZE) pageSize: Int?,
                 @Query(QueryParams.OFFSET) offset: Int?,
                 @Query(QueryParams.ORDER) order: String?,
                 @Query(QueryParams.ORDER_BY) orderBy: String?,
                 @Query(QueryParams.CLASS) clazz: String?): Single<Response<List<Tax>>>

    @GET
    fun getProductCollectionFromLink(@Url link: String): Observable<Response<List<Product>>>

    @GET
    fun getOrderCollectionFromLink(@Url link: String): Observable<Response<List<Order>>>
}

