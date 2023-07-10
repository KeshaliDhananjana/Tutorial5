object Q2_5 {
  def main(args: Array[String]): Unit = {
    print("Input a number:");
    val number = scala.io.StdIn.readInt();
    primeSeq(number);
  }

  def prime(a: Int, b: Int = 2): Boolean ={
    b match {
      case x if x == a => true;
      case x if a % x == 0 => false;
      case x => prime(a, x + 1);
    }
  }

  def primeSeq(n: Int): Unit = {
    if (n > 1) {
      primeSeq(n - 1);
      if (prime(n))
        println(n);
    }
  }
}