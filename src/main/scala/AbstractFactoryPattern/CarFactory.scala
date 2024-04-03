package main.scala.AbstractFactoryPattern

trait CarFactory {
  def createEngine(): Engine
  def createWheel(): Wheel
  def createBrand(): Brand
}

object AudiCarFactory extends CarFactory {
  override def createBrand(): Brand = new AudiBrand

  override def createEngine(): Engine = new V6Engine

  override def createWheel(): Wheel = new DunlopWheel
}

object BMWCarFactory extends CarFactory {
  override def createBrand(): Brand = new BMWBrand

  override def createEngine(): Engine = new V8Engine

  override def createWheel(): Wheel = new MichelinWheel
}