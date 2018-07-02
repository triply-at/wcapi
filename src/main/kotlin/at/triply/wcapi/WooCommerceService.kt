package at.triply.wcapi

import at.triply.wcapi.converters.CollectionResponse
import at.triply.wcapi.model.Order
import at.triply.wcapi.model.Product
import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WooCommerceService {

    @GET("orders")
    fun getOrders(@Query(Constants.KEY) key: String,
                  @Query(Constants.SECRET) secret: String,
                  @Query(Constants.CONTEXT) context: String?,
                  @Query(Constants.PAGE) page: Int?,
                  @Query(Constants.PAGE_SIZE) pageSize: Int?,
                  @Query(Constants.SEARCH) search: String?,
                  @Query(Constants.AFTER) after: String?,
                  @Query(Constants.BEFORE) before: String?,
                  @Query(Constants.EXCLUDE) exclude: Array<Int>?,
                  @Query(Constants.INCLUDE) include: Array<Int>?,
                  @Query(Constants.OFFSET) offset: Int?,
                  @Query(Constants.ORDER) order: String?,
                  @Query(Constants.ORDERBY) orderBy: String?,
                  @Query(Constants.PARENT) parent: Array<Int>?,
                  @Query(Constants.PARENT_EXCLUDE) parentExclude: Array<Int>?,
                  @Query(Constants.STATUS) status: String?,
                  @Query(Constants.CUSTOMER) customer: Int?,
                  @Query(Constants.PRODUCT) product: Int?,
                  @Query(Constants.DECIMAL_POINTS) decimalPoints: Int?): Single<Response<List<Order>>>

    @GET("products")
    fun getProducts(@Query(Constants.KEY) key: String,
                    @Query(Constants.SECRET) secret: String): Single<Response<List<Product>>>
}