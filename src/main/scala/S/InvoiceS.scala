package main.scala.S


// this class has only one reason to change
class InvoiceS(marker: Marker, quantity: Int) {
  def calculateTotal(): Int = {
    marker.price * quantity
  }
}
