package com.paysera.lib.auth.entities.requests

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreateSystemTokenOptionalRequest(
    val audience: String,
    val scope: String
)