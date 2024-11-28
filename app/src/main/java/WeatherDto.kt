//import com.google.gson.annotations.SerializedName
//
//
//data class Clouds(
//    val all: Int
//)
//
//
//data class Coord(
//    val lon: Double,
//    val lat: Double
//)
//
//
//data class Main(
//    val temp: Double,
//    @SerializedName("feels_like") val feelsLike: Double,
//    @SerializedName("temp_min") val tempMin: Double,
//    @SerializedName("temp_max") val tempMax: Double,
//    val pressure: Int,
//    val humidity: Int,
//    @SerializedName("sea_level") val seaLevel: Int? = null,
//    @SerializedName("grnd_level") val grndLevel: Int? = null
//)
//
//
//data class Rain(
//    @SerializedName("1h") val oneHour: Double? = null
//)
//
//
//data class Root(
//    val coord: Coord,
//    val weather: List<Weather>,
//    val base: String,
//    val main: Main,
//    val visibility: Int,
//    val wind: Wind,
//    val rain: Rain? = null,
//    val clouds: Clouds,
//    val dt: Int,
//    val sys: Sys,
//    val timezone: Int,
//    val id: Int,
//    val name: String,
//    val cod: Int
//)
//
//
//data class Sys(
//    val type: Int,
//    val id: Int,
//    val country: String,
//    val sunrise: Int,
//    val sunset: Int
//)
//
//
//data class Weather(
//    val id: Int,
//    val main: String,
//    val description: String,
//    val icon: String
//)
//
//
//data class Wind(
//    val speed: Double,
//    val deg: Int,
//    val gust: Double? = null
//)
