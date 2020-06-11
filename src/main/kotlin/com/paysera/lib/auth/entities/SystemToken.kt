package com.paysera.lib.auth.entities

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SystemToken(
    val value: String,
    @Json(name = "expires_in")
    val expiresIn: Int,
    val scope: String,
    val audience: String
)