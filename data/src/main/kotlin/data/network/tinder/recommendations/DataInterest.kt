package data.network.tinder.recommendations

import com.squareup.moshi.Json

internal class DataInterest private constructor(
        @Json(name = "id")
        private val id: String,
        @Json(name = "name")
        private val name: String)