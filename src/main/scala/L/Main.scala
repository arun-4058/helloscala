package main.scala.L

object Main {

  def main(args: Array[String]): Unit = {
    val vehicleList: List[Vehicle] = List(new Car, new Motocycle, new Bicycle)
    vehicleList.foreach(vehicle => println(s"vehicle engine type :: ${vehicle.getNoOfWheels().toString}"))
  }

}
