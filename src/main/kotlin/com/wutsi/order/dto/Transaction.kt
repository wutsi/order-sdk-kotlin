package com.wutsi.order.dto

import java.time.OffsetDateTime
import kotlin.Double
import kotlin.Long
import kotlin.String

public data class Transaction(
  public val id: Long = 0,
  public val siteId: Long = 0,
  public val partnerId: Long = 0,
  public val description: String? = null,
  public val amount: Double = 0.0,
  public val providerFees: Double = 0.0,
  public val wutsiFees: Double = 0.0,
  public val net: Double = 0.0,
  public val currency: String = "",
  public val type: String = "",
  public val transactionDateTime: OffsetDateTime = OffsetDateTime.now()
)
