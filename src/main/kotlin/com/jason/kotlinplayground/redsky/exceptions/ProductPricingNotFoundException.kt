package com.jason.kotlinplayground.redsky.models.exceptions

class ProductPricingNotFoundException: RuntimeException {
    constructor() : super()
    constructor(message: String) : super(message)
    constructor(message: String, cause: Exception) : super(message, cause)
    constructor(cause: Exception) : super(cause)
}