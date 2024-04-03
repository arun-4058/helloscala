package main.scala.ObserverPattern

import scala.collection.mutable.ListBuffer

class Weather {
  val observers: ListBuffer[WeatherObserver] = ListBuffer[WeatherObserver]()
  var currentWeather: WeatherType = WeatherType.SUNNY

  def addObserver(ob: WeatherObserver): Unit = {
    observers.append(ob)
  }

  def removeObserver(ob: WeatherObserver): Unit = {
    val index = observers.indexOf(ob)
    if (index != -1){
      observers.remove(index)
    }
  }

  def weatherChange(weather: WeatherType): Unit = {
    currentWeather = weather
    notifyObservers()
  }

  def notifyObservers(): Unit = {
    observers.foreach(ob => ob.update(currentWeather))
  }

}
