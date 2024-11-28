package com.example.appclimacompose.domain.repository


import com.example.appclimacompose.domain.model.Weather

interface WeatherRepository {
    suspend fun getWeather(lat: Double, lon: Double): Weather
}