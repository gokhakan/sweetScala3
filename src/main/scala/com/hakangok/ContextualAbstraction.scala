package com.hakangok

object ContextualAbstraction {
  def main(args: Array[String]): Unit = {
    println("Hello world")
    val aList = List(3,2,4,1,7,6)
    println(s"Ascending list of $aList is ${aList.sorted}")
    println(aList.sorted.reverse)
    println(aList.sum)
    println(aList.max)
    println(aList.min)
  }

}
