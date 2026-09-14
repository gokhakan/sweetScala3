package com.hakangok

object FunctionalProgramming extends App{
  println("Hello Functions")

  //syntax sugars
  val doubler: (Int) => Int = (x:Int) =>2*x
  val n=20
  println(s"Double of $n is ${doubler(20)}")

  //higher order functions
  //map
  val originalList = List(1,2,3)
  val aMappedList = originalList.map(x=>x*3)
  println("Mapped new list of: " +originalList + " is: " + aMappedList)

  //flatmap
  val aFlatMap = List(1,2,3).flatMap(x=>List(x, x+10))
  println("Flatmapped new list: " + aFlatMap)

  //filter
  val aFilteredList = originalList.filter(x=>x<=2)
  println("Filtered list: " + aFilteredList)

  //all pair
  val letterList =List('a','b','c')

  val allPairs = originalList.flatMap(number=> letterList.map(letter=> s"$number-$letter"))
  println("Allpairs: " + allPairs)

  //for comprehensions
  val alternativePair = for{
    number<- originalList
    letter<- letterList
  }yield s"$number+$letter"
  println("For comprehension result list: " + alternativePair)
}
