object Q3_5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    val number = scala.io.StdIn.readInt();
    print(sum(number));
  }

  def sum(a: Int): Int = {
    if(a == 1) {
      1
    }
    else {
      a + sum(a-1)
    }
  }
}