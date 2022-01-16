package com.wutsi.order.dto

import kotlin.Double
import kotlin.Long
import kotlin.String

public data class CreateOrderRequest(
  public val siteId: Long? = null,
  public val partnerId: Long? = null,
  public val productId: Long? = null,
  public val productRateId: Long? = null,
  public val description: String = "",
  public val total: Double = 0.0,
  public val currency: String = ""
)
