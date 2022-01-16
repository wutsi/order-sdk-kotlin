package com.wutsi.order.dto

import kotlin.Double
import kotlin.Long
import kotlin.String

public data class CreatePaymentRequest(
  public val orderId: Long = 0,
  public val provider: String = "",
  public val amount: Double = 0.0,
  public val fees: Double = 0.0,
  public val currency: String = "",
  public val externalId: String = ""
)
