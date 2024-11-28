package com.example.appclimacompose.domain.usecase


import com.example.appclimacompose.domain.model.Weather
import com.example.appclimacompose.domain.repository.WeatherRepository
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun execute(lat: Double, lon: Double): Weather {
        return weatherRepository.getWeather(lat, lon)
    }
}
