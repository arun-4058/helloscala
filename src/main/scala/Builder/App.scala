package main.scala.Builder

object App {
  def main(args: Array[String]): Unit = {
    val car = new DIYCarBuilder().setEngine("V6").setWheels(4).setColor("Red").build()
    println(car)
  }
}
