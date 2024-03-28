package main.scala.D

trait Keyboard {
  def getType: String
}

class WiredKeyboard extends Keyboard {
  override def getType: String = "WiredKeyboard"
}

class BluetoothKeyboard extends Keyboard {
  override def getType: String = "BluetoothKeyboard"
}
