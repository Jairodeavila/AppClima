package com.example.appclimacompose.data.api


import com.example.appclimacompose.data.dto.WeatherResponseDto
import com.example.appclimacompose.utils.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

    interface WeatherApi {
        @GET("data/2.5/weather")
        suspend fun getWeather(
            @Query("lat") lat: Double,
            @Query("lon") lon: Double,
            @Query("units") units: String = "metric",
            @Query("appid") apiKey: String = API_KEY
        ): WeatherResponseDto
    }
