package main.scala.S


/*
Invoice class has more than one reason to change, not following single responsibility principle
 */

class Invoice(marker: Marker, quantity: Int) {

  def calculateTotal(): Int = {
    marker.price * quantity
  }

  def printInvoice(): Unit = {
    println("print invoice to the console")
  }

  def saveToDB(): Unit = {
    println("save invoice to db")
  }

}