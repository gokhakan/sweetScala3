object Main {
  def calculateSweetsIterative(initialCoins: Int): Int = {
    var coins = initialCoins
    var totalSweets = 0
    var wrappers = 0

    // Continue buying sweets while we have enough coins
    while (coins >= 1) {
      val boughtSweets = coins
      totalSweets += boughtSweets
      wrappers += boughtSweets

      // Calculate new coins from wrappers
      val newCoins = wrappers / 3
      wrappers %= 3 // Keep remaining wrappers
      coins = newCoins

      println(f"After buying $boughtSweets sweets:")
      println(f"Total sweets eaten: $totalSweets")
      println(f"Wrappers left: $wrappers")
      println(f"New coins earned: $newCoins\n")
    }
    totalSweets
  }

  def main(args: Array[String]): Unit = {
    println("Using iterative solution:")
    val iterativeResult = calculateSweetsIterative(15)
    println(s"Final result (iterative): $iterativeResult sweets\n")
    println("end of Demo")
  }
}