package main.scala.FactoryKit

import scala.collection.mutable

class WeaponFactoryKit(dict: Map[String, () => Weapon]) {
  def create(key: String): Weapon = {
    dict(key)()
  }
}

object WeaponFactoryKit{
  def factory(builder: mutable.Map[String, () => Weapon] => Unit) = {
    val dict = mutable.Map[String, () => Weapon]()
    builder(dict)
    new WeaponFactoryKit(dict.toMap)
  }
}