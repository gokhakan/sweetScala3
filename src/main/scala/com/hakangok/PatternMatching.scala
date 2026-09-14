package com.hakangok

object PatternMatching extends App{
  //switch expression
  val anInteger =55
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }
  println(order)

  //PM is an expression

  //case clas decomposition
  case class Person(name:String, age:Int, money:Int)
  val bob = Person("Bob", 43, 77)
  val personGreeting = bob match{
    case Person(n,a, m) => s"Hi, I am $n, and I am $a"
    case _ => "Not found"
  }
  println(personGreeting)

  //tuple decomposition
  val aTuple = ("Bon Jovi", "Rock")
  val bandDescription = aTuple match {
    case (band, genre) => s"$band is in $genre"
    case _ => "unknown"
  }
  println(bandDescription)

  //List decomposition
  val aList = List(1,2,3)
  val listDescription = aList match{
    case List(_,2,_) => "List has 2 in it"
    case _ => "unknown"
  }
  println(listDescription)


}
