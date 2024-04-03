package main.scala.ObserverPattern

trait WeatherType

object WeatherType{
  case object SUNNY extends WeatherType
  case object RAINY extends WeatherType
  case object COLD extends WeatherType
}
