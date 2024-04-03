package main.scala.ObserverPattern

trait WeatherObserver {
  def update(currentWeather: WeatherType)
}

class Boy extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. Lets play football")
    case WeatherType.RAINY => println("It's raining, let's play video game at home")
    case WeatherType.COLD => println("It is cold let's just sleep")
  }
}

class Girl extends WeatherObserver {
  override def update(currentWeather: WeatherType): Unit = currentWeather match {
    case WeatherType.SUNNY => println("It is sunny. Let's go shopping")
    case WeatherType.RAINY => println("It's raining, let's take bicycle and go out")
    case WeatherType.COLD => println("It is cold let's have coffee")
  }
}
