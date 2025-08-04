object SweetWrapperPuzzle:

  private def totalSweets(initialCoins: Int): Int =
    var sweets = initialCoins
    var wrappers = initialCoins

    while wrappers >= 3 do
      val bonusCoins = wrappers / 3
      println(Console.RED + "bonusCoins : " + bonusCoins + Console.RESET)
      println(Console.YELLOW + "wrappers : " + wrappers + Console.RESET)


      sweets += bonusCoins
      wrappers = (wrappers % 3) + bonusCoins
    println(Console.BLUE + "sweets : " + sweets + Console.RESET)

    sweets

  @main def runPuzzle(): Unit =
    val initialCoins = 15
    println(Console.GREEN + "initialCoins : " + initialCoins + Console.RESET)
    val result = totalSweets(initialCoins)
    println(s"Total sweets you can get: $result")
