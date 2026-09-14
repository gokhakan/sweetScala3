package com.hakangok

object ObjectOrientation extends App{
  println("Hello Scala OOP")
  case class Person(name:String, age:Int)
  val bob = Person("Bob", 45)
  println(s"${bob.name} is a man of ${bob.age}")

  //exceptions
  try{
    val studentName: String ="Hakan"
    println(studentName.length)
    println(studentName.charAt(10))
    }catch{
    case e: Exception =>
      println(s"Exception caught: ${e.getMessage}")
      println(s"Exception class: ${e.getClass.getName}")
  }finally {
    println("this is executed finally")
  }

  //list
  val myList: List[Int]=List(5,6,7)
  println(s"Head value of my list is ${myList.head}")
  println(s"Tail value of my list is ${myList.tail}")
  println(s"Last value of my list is ${myList.last}")
  println(s"2th value of my list is ${myList(1)}")

}

