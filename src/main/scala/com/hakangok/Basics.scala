package com.hakangok

object Basics extends App {
  //defining value
  private val number:Int = 42
  private val aBoolean: Boolean = true
  println(number + " is actually: " + aBoolean)
  println(s"$number is actually $aBoolean")

  //expression
  private val anExpression = 2+ 3
  println(s"The value of the expression is: $anExpression")

  //if-expression
  val ifExpression = if(number>43) "Hakan" else "gok"
  println(s"$ifExpression is this")

  //chained if-expression
  val chainedIfExpression = {
    if(number<42) "Hakan"
    else if(number==42) "that's it!!!"
    else if(number>42) "Gok"
    else if(number>999)"too big"
    else "forget it"
  }
  println(chainedIfExpression)

  //code block
  val aCodeBlock ={
    val aLocalValue=2
    aLocalValue+10+"Hakan"
  }
  println(s"CodeBlock return value is $aCodeBlock")

  //define a function
  def myFunction(x:Int, y:String):String = y + " " + x
  println(s"Value of my function is: ${myFunction(2,"gok")}")

  //recursive functions
  def factorial(n:Int):Int= {
    if(n<=1) 1
    else n * factorial(n-1)
  }
  val n = 11
  println(s"Factorial of $n is ${factorial(n)}")

  //unit functions
  def myUnitFunction(name:String):Unit = println(s"some stuff and $name")

  println(myUnitFunction("hakan"))
}
