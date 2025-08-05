package com.hakangok

object Sandbox {
  val name: String = "Hakan"

  @main
  def runThis(): Unit =
    println(Console.RED + s"Name is: $name" + Console.RESET)
    println(Console.GREEN + name + Console.RESET)
}
