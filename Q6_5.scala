object Q6_5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    val number = scala.io.StdIn.readInt()
    val fibonacciSequence = printFibonacci(number)
    println(s"Fibonacci sequence up to $number terms:")
    fibonacciSequence.foreach(num => print(s"$num "))
  }

  def printFibonacci(n: Int): List[Int] = {
    if (n <= 0) {
      Nil
    } else if (n == 1) {
      List(0)
    } else if (n == 2) {
      List(0, 1)
    } else {
      val fibonacciList = printFibonacci(n - 1)
      val nextFibonacci = fibonacciList(n - 2) + fibonacciList(n - 3)
      fibonacciList :+ nextFibonacci
    }
  }
}