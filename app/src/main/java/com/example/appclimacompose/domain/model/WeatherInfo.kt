package com.example.appclimacompose.domain.model



data class Weather(
    val temperature: Double,
    val feelsLike: Double,
    val humidity: Int,
    val windSpeed: Double,
    val weatherDescription: String
)
