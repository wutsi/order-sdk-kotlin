package com.wutsi.order.dto

import kotlin.collections.List

public data class SearchTransactionResponse(
  public val transactions: List<Transaction> = emptyList()
)
