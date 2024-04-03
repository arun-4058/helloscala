package main.scala.Builder

trait CarBuilder {
  def setEngine(engine: String): CarBuilder
  def setWheels(wheels: Int): CarBuilder
  def setColor(color: String): CarBuilder
  def build(): Car
}

class DIYCarBuilder extends CarBuilder{
  private var wheels: Int = 0
  private var engine: String = ""
  private var color: String = ""

  override def setWheels(wheels: Int): CarBuilder = {
    this.wheels = wheels
    this
  }

  override def setColor(color: String): CarBuilder = {
    this.color = color
    this
  }

  override def setEngine(engine: String): CarBuilder = {
    this.engine = engine
    this
  }

  override def build(): Car = Car(engine = engine, wheels = wheels, color = color)
}
