package main.scala.FactoryKit

trait Weapon

class Axe extends Weapon{
  override def toString: String = "Axe"
}

class Sword extends Weapon{
  override def toString: String = "Sword"
}

class Bow extends Weapon{
  override def toString: String = "Bow"
}