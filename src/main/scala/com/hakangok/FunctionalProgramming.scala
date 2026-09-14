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

  //collections
  //[1] List
  val aList =List(1,2,3,4,5)
  println("Head: " + aList.head)
  println("Tail: " + aList.tail)
  println("Prepend: " + "gok"::aList)
  println("Prepend and Append: " + {"hakan" +: aList :+ "gok"})

  //[2] Sequences
  val aSequence: Seq[Int] = Seq(1,2,3)
  println("Second val in " + aSequence + " is: " + aSequence(1))

  //[3] Vectors are fast Seq
  val aVector = Vector(6,7,8)
  println("vector: " + aVector + " has length " + aVector.length)

  //[4] Sets = no duplicates
  val aSet = Set(1,2,3,4,1,2,3)
  println("set has 5 is: " + aSet.contains(5))
  println("remove 1 from set: " + (aSet -1))
  println("add to set: " + (aSet+99))

  //[5] Range
  val aRange = 1 to 5
  println("doubled range: " + aRange.map(x=>x*2).toList)

  //[6] Tuples
  val aTuple = ("hakan", "gok", 99)
  println("Head of tuple is: " + aTuple.head + " , last: " + aTuple.last)

  //[7] Maps
  val aPhonebook:Map[String, Int] = Map(
    "hakan"->11,
    "gok"->22
  )

  println("Phone book: " + aPhonebook.head)

}
