package com.example.appclimacompose.presentation.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appclimacompose.domain.usecase.GetWeatherUseCase
import com.example.appclimacompose.domain.model.Weather
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val getWeatherUseCase: GetWeatherUseCase
) : ViewModel() {


    private val _weather = mutableStateOf<Weather?>(null)
    val weather: State<Weather?> = _weather


    private val _isLoading = mutableStateOf(false)
    val isLoading: State<Boolean> = _isLoading


    private val _error = mutableStateOf<String?>(null)
    val error: State<String?> = _error


    fun getWeather(lat: Double, lon: Double) {
        _isLoading.value = true
        _error.value = null
        viewModelScope.launch {
            try {

                val weatherData = getWeatherUseCase.execute(lat, lon)
                _weather.value = weatherData
            } catch (e: Exception) {

                _error.value = "Error al obtener los datos del clima: ${e.message}"
                _weather.value = null
            } finally {
                _isLoading.value = false
            }
        }
    }
}











