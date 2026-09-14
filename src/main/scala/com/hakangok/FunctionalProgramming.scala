package com.hakangok

object FunctionalProgramming extends App{
  println("Hello Functions")

  //syntax sugars
  val doubler: (Int) => Int = (x:Int) =>2*x
  val n=20
  println(s"Double of $n is ${doubler(20)}")

  //higher order functions
  val originalList = List(1,2,3)
  val aMappedList = originalList.map(x=>x*3)
  println("Mapped new list of: " +originalList + " is: " + aMappedList)

  val aFlatMap = List(1,2,3).flatMap(x=>List(x, x+10))
  println("Flatmapped new list: " + aFlatMap)
}
