package data.tinder.recommendations

import com.squareup.moshi.Json

internal class DataRecommendationUserJobTitle private constructor(
        @Json(name = "name")
        private val name: String)