package com.wutsi.order

import com.wutsi.order.dto.CreateOrderRequest
import com.wutsi.order.dto.CreateOrderResponse
import com.wutsi.order.dto.CreatePaymentRequest
import com.wutsi.order.dto.CreatePaymentResponse
import com.wutsi.order.dto.CreatePayoutRequest
import com.wutsi.order.dto.CreatePayoutResponse
import com.wutsi.order.dto.GetOrderResponse
import com.wutsi.order.dto.SearchTransactionResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import java.time.LocalDate
import kotlin.Long

public interface OrderApi {
  @RequestLine("POST /v1/orders")
  @Headers(value=["Content-Type: application/json"])
  public fun createOrder(request: CreateOrderRequest): CreateOrderResponse

  @RequestLine("GET /v1/orders/{order-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getOrder(@Param("order-id") orderId: Long): GetOrderResponse

  @RequestLine("POST /v1/payouts")
  @Headers(value=["Content-Type: application/json"])
  public fun createPayout(request: CreatePayoutRequest): CreatePayoutResponse

  @RequestLine("POST /v1/payments")
  @Headers(value=["Content-Type: application/json"])
  public fun createPayment(request: CreatePaymentRequest): CreatePaymentResponse

  @RequestLine("GET /v1/transactions?partner-id={partner-id}&start-date={start-date}&end-date={end-date}")
  @Headers(value=["Content-Type: application/json"])
  public fun searchTransaction(
    @Param("partner-id") partnerId: Long? = null,
    @Param("start-date") startDate: LocalDate,
    @Param("end-date") endDate: LocalDate
  ): SearchTransactionResponse
}
