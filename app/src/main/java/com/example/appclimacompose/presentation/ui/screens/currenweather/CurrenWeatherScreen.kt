package com.example.appclimacompose.presentation.ui

import android.annotation.SuppressLint
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextOverflow
import com.example.appclimacompose.domain.model.Weather
import com.example.appclimacompose.presentation.ui.components.WeatherCard
import com.example.appclimacompose.presentation.ui.viewmodel.WeatherViewModel


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(weatherViewModel: WeatherViewModel = viewModel()) {
    val weather = weatherViewModel.weather.value
    val isLoading = weatherViewModel.isLoading.value
    val error = weatherViewModel.error.value

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Clima Actual") })
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                if (isLoading) {
                    LoadingIndicator()
                } else {
                    weather?.let {
                        WeatherCard(weather = it)
                    } ?: run {
                        if (error != null) {
                            Text("Error: $error")
                        } else {
                            Text("No se pudieron obtener los datos del clima")
                        }
                    }
                }
            }
        }
    )
}


@Composable
fun WeatherInfo(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "$label $value",
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun LoadingIndicator() {
    CircularProgressIndicator(modifier = Modifier.padding(16.dp))
}


