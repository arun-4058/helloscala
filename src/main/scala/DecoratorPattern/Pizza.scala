package main.scala.DecoratorPattern

trait Pizza {
  def getCost: Int
  def getDescription: String
}

trait ExtraCheese extends Pizza {
  abstract override def getDescription: String = super.getDescription + " with extra cheese topping"

  abstract override def getCost: Int = super.getCost + 50
}

trait Mushroom extends Pizza {
  abstract override def getDescription: String = super.getDescription + " with mushroom topping"

  abstract override def getCost: Int = super.getCost + 70
}

class FarmHouse extends Pizza {
  override def getDescription: String = "FarmHouse Pizza"

  override def getCost: Int = 200
}

class VegDelight extends Pizza {
  override def getDescription: String = "VegDelight Pizza"

  override def getCost: Int = 300
}

class Margherita extends Pizza {
  override def getDescription: String = "Margherita Pizza"

  override def getCost: Int = 250
}
