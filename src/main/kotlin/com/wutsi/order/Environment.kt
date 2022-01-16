package com.wutsi.order

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-order-test.herokuapp.com"),
  PRODUCTION("https://wutsi-order-prod.herokuapp.com"),
  ;
}
