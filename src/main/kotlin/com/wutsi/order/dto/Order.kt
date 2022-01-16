package com.wutsi.order.dto

import java.time.OffsetDateTime
import kotlin.Double
import kotlin.Long
import kotlin.String

public data class Order(
  public val id: Long = 0,
  public val siteId: Long = 0,
  public val productId: Long = 0,
  public val productRateId: Long = 0,
  public val partnerId: Long = 0,
  public val description: String = "",
  public val total: Double = 0.0,
  public val currency: String = "",
  public val status: String = "",
  public val creationDateTime: OffsetDateTime = OffsetDateTime.now()
)
