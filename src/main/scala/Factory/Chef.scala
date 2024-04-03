package main.scala.Factory

// client
trait Chef {
  def makeNoodle(): Noodle
  def cook(): Unit = {
    val noodle = makeNoodle()
    println(s"This noodle is ")
  }
}


class ThaiChef extends Chef{
  override def makeNoodle(): Noodle = new PadThai()
}


class ItalianChef extends Chef{
  override def makeNoodle(): Noodle = new Spaghetti()
}
