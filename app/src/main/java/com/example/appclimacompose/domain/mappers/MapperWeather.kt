package com.example.appclimacompose.domain.mappers

import com.example.appclimacompose.data.dto.WeatherResponseDto
import com.example.appclimacompose.domain.model.Weather


fun WeatherResponseDto.toDomainModel(): Weather {
    return Weather(
        temperature = main.temp,
        feelsLike = main.feels_like,
        humidity = main.humidity,
        windSpeed = wind.speed,
        weatherDescription = weather.firstOrNull()?.description ?: ""
    )
}

