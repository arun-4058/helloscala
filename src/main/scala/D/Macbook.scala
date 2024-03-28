package main.scala.D


// this class definition is extending concrete classes.
// due to this we can't make a macbook support bluetooth mouse/keyboard
// hence class should extend interfaces
//class Macbook(wiredMouse: WiredMouse, wiredKeyboard: WiredKeyboard) {
//  def printMacbookSpecs(): Unit = {
//    println(s"Macbook supports ${wiredMouse.getType} and ${wiredKeyboard.getType}")
//  }
//}


// this class is depending on interface rather than concrete class
class Macbook(mouse: Mouse, keyboard: Keyboard){
  def printMacbookSpec(): Unit = {
    println(s"Macbook supports ${mouse.getType} and ${keyboard.getType}")
  }
}

object Macbook{
  def main(args: Array[String]): Unit = {
    val wiredMouse: WiredMouse = new WiredMouse
    val wiredKeyboard: WiredKeyboard = new WiredKeyboard

//    val macbook1 = new Macbook(wiredMouse, wiredKeyboard)
//    macbook1.printMacbookSpecs()

    val bluetoothMouse: BluetoothMouse = new BluetoothMouse
    val bluetoothKeyboard: BluetoothKeyboard = new BluetoothKeyboard

    val macbook2 = new Macbook(wiredMouse, wiredKeyboard)
    val macbook3 = new Macbook(bluetoothMouse, bluetoothKeyboard)
    val macbook4 = new Macbook(bluetoothMouse, wiredKeyboard)
    val macbook5 = new Macbook(wiredMouse, bluetoothKeyboard)

    macbook2.printMacbookSpec()
    macbook3.printMacbookSpec()
    macbook4.printMacbookSpec()
    macbook5.printMacbookSpec()

  }
}