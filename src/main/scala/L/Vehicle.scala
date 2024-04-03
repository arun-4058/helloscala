package main.scala.L


//// this implementation will break Liskov substitution principle for bicycle
//class Vehicle {
//  def getNoOfWheels(): Int = 2
//  def getEngineType(): String = "500cc"
//}

// in the parent class put only very generic methods
class Vehicle {
  def getNoOfWheels(): Int = 2
}


class Motocycle extends Vehicle {
}

class Car extends Vehicle {
  override def getNoOfWheels(): Int = 4
  def getEngineType(): String = "1800cc"
}

// this is narrowing the capability of the vehicle class
class Bicycle extends Vehicle{
  def getEngineType(): String = null
}