package com.hakangok

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global
object Advanced extends App {

  //lazy val
  lazy val aLazyValue = 2
  lazy val lazyValueWithSideEffect ={
    println("I am lazy")
    43
  }
  println(lazyValueWithSideEffect+10)

  //Option/Try
  def methodWhichCanReturnNull() : String = "Hello scala"
  println(Option(methodWhichCanReturnNull())) //Some(Hello Scala)

  val stringProcessing = Option(methodWhichCanReturnNull()) match {
    case Some(string) => s" I have string $string"
    case None => "nothing"
  }
  println(stringProcessing)

  def methodWhichCanThrowException():String = throw new RuntimeException
  val aTry = Try(methodWhichCanThrowException())
  val anotherStringProcessing = aTry match{
    case Success(value)=>s"I have value $value"
    case Failure(exception)=>s"I have exception $exception"
  }
  println(aTry)

  //evaluate asynchronously
  //Future
  val aFuture = Future{
    println("...loading")
    Thread.sleep(1000)
    println("I have completed value")
    67
  }
  Thread.sleep(2000)
  println(aFuture)

  //Implicits
  def aMethodWithImplicitArgs(implicit arg: Int) = arg +1
  implicit val myImplicitInt: Int =46
  println(aMethodWithImplicitArgs)
}
