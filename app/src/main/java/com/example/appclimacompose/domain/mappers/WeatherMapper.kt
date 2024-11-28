//import com.example.appclimacompose.data.dto.WeatherResponseDto
//import com.example.appclimacompose.domain.model.MainDomain
//import com.example.appclimacompose.domain.model.WeatherDomain
//import com.example.appclimacompose.domain.model.WindDomain
//
//fun Root.toDomain(): WeatherDomain {
//    return WeatherDomain(
//        cityName = name,
//        temperature = main.temp,
//        feelsLike = main.feelsLike,
//        tempMin = main.tempMin,
//        tempMax = main.tempMax,
//        pressure = main.pressure,
//        humidity = main.humidity,
//        weatherDescription = weather.firstOrNull()?.description ?: "Desconocido"
//    )
//}
//
//
//fun Wind.toDomain(): WindDomain {
//    return WindDomain(
//        speed = speed,
//        degree = deg
//    )
//}
//
//
//fun Main.toDomain(): MainDomain {
//    return MainDomain(
//        temperature = temp,
//        feelsLike = feelsLike
//    )
//}
//


