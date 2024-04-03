package main.scala.Factory

// product interface
trait Noodle {
  def flavor(): String
}

// concrete product
class PadThai extends Noodle{
  override def flavor(): String = "Thai Flavor"
}

// concrete product
class Spaghetti extends Noodle{
  override def flavor(): String = "Italian Flavor"
}
