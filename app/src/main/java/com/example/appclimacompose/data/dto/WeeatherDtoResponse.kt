package com.example.appclimacompose.data.dto


data class WeatherResponseDto(
    val main: Main,
    val weather: List<Weather>,
    val wind: Wind
)

data class Main(
    val temp: Double,
    val feels_like: Double,
    val humidity: Int
)

data class Wind(
    val speed: Double
)

data class Weather(
    val description: String,
    val icon: String
)
