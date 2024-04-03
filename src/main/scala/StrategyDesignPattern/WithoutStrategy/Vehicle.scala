package main.scala.StrategyDesignPattern.WithoutStrategy

class Vehicle {
  def drive(): Unit = println("normal drive capability")
}

class SportsVehicle extends Vehicle{
  override def drive(): Unit = println("sports drive capability")
}

class PassengerVehicle extends Vehicle{
}

class OffRoadVehicle extends Vehicle{

  // off road needed sports capability and we are making in duplicate
  override def drive(): Unit = println("sports drive capability")
}

class GoodsVehicle extends Vehicle{
  override def drive(): Unit = println("Goods drive capability")
}