package main.scala.StrategyDesignPattern.WithStrategy

trait DriveStrategy {
  def drive(): Unit
}

class SportsDriveStrategy extends DriveStrategy{
  override def drive(): Unit = println("sports drive strategy")
}

class NormalDriveStrategy extends DriveStrategy{
  override def drive(): Unit = println("normal drive strategy")
}
