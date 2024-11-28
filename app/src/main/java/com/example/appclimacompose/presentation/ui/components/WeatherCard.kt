package com.example.appclimacompose.presentation.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.appclimacompose.domain.model.Weather
import com.example.appclimacompose.presentation.ui.WeatherInfo


@SuppressLint("DefaultLocale")
@Composable
fun WeatherCard(weather: Weather) {
    Card(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val formattedTemperature = String.format("%.1f", weather.temperature)
            val formattedFeelsLike = String.format("%.1f", weather.feelsLike)
            val windSpeedInKmH = String.format("%.1f", weather.windSpeed * 3.6)

            Text(
                text = "Temperatura: $formattedTemperature°C",
                maxLines = 1,
            )

            Spacer(modifier = Modifier.height(8.dp))

            WeatherInfo(
                label = "Sensación térmica:",
                value = "$formattedFeelsLike°C"
            )

            WeatherInfo(
                label = "Humedad:",
                value = "${weather.humidity}%"
            )

            WeatherInfo(
                label = "Viento:",
                value = "$windSpeedInKmH km/h"
            )

            WeatherInfo(
                label = "Descripción:",
                value = weather.weatherDescription
            )
        }
    }
}
