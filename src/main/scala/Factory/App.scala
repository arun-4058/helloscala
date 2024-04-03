package main.scala.Factory

class App {
  def main(args: Array[String]): Unit = {
    val chef = new ItalianChef
    chef.cook()
  }
}
