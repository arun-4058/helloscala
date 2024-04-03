package main.scala.DecoratorPattern

object Main {
  def main(args: Array[String]): Unit = {
    val coffee = new SimpleCoffee with MilkAdded with SugarAdded
    println(coffee.getCost)
    println(coffee.getDescription)

    val coffeeWithoutMilk = new SimpleCoffee with SugarAdded
    println(coffeeWithoutMilk.getCost)
    println(coffeeWithoutMilk.getDescription)

    val coffeeWithoutSugar = new SimpleCoffee with MilkAdded
    println(coffeeWithoutSugar.getCost)
    println(coffeeWithoutSugar.getDescription)

    val farmHouseWithExtraCheese = new FarmHouse with ExtraCheese
    println(farmHouseWithExtraCheese.getDescription + " cost :: " + farmHouseWithExtraCheese.getCost)
  }
}
