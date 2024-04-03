package main.scala.ObserverPattern

object App {

  def main(args: Array[String]): Unit = {
    val weather = new Weather
    weather.addObserver(new Boy)
    weather.addObserver(new Girl)
    weather.weatherChange(WeatherType.COLD)
    weather.weatherChange(WeatherType.RAINY)
    weather.weatherChange(WeatherType.SUNNY)
  }

}
