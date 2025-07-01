object SweetWrapperPuzzle:

  private def totalSweets(initialCoins: Int): Int =
    var sweets = initialCoins
    var wrappers = initialCoins

    while wrappers >= 3 do
      val bonusCoins = wrappers / 3
      sweets += bonusCoins
      wrappers = (wrappers % 3) + bonusCoins

    sweets

  @main def runPuzzle(): Unit =
    val initialCoins = 15
    val result = totalSweets(initialCoins)
    println(s"Total sweets you can get: $result")
