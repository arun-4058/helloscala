package main.scala.D

trait Mouse {
  def getType: String
}

class WiredMouse extends Mouse{
  override def getType: String = "WiredMouse"
}

class BluetoothMouse extends Mouse{
  override def getType: String = "BluetoothMouse"
}