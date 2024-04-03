package main.scala.FactoryKit

object App {
  def main(args: Array[String]): Unit = {
    val factory = WeaponFactoryKit.factory { builder =>
      builder.put("axe", () => new Axe())
      builder.put("bow", () => new Bow())
      builder.put("sword", () => new Sword())
    }

    val axe = factory.create("axe")
    println(axe)
  }
}
