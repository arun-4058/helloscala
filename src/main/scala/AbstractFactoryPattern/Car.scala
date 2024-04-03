package main.scala.AbstractFactoryPattern

class Car(factory: CarFactory) {

  val engine = factory.createEngine()
  val wheel = factory.createWheel()
  val brand = factory.createBrand()

  def drive(): Unit = {
    brand.light()
    engine.start()
    wheel.rotate()
  }

}
