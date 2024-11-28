package com.example.appclimacompose.data.repository

import com.example.appclimacompose.data.api.WeatherApi
import com.example.appclimacompose.domain.mappers.toDomainModel
import com.example.appclimacompose.domain.model.Weather
import com.example.appclimacompose.domain.repository.WeatherRepository
import com.example.appclimacompose.utils.Constants.API_KEY
import javax.inject.Inject


class WeatherRepositoryImpl @Inject constructor(
    private val weatherApi: WeatherApi
) : WeatherRepository {

    override suspend fun getWeather(lat: Double, lon: Double): Weather {
        val weatherResponse = weatherApi.getWeather(lat, lon, API_KEY)
        return weatherResponse.toDomainModel()
    }
}