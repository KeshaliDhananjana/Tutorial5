object Q4_5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    val number = scala.io.StdIn.readInt();
    if(even(number)){
      print(s"$number is even");
    }
    else{
      print(s"$number is odd");
    }

    def even(n: Int): Boolean = {
      if (n == 0) {
        true
      } else if (n == 1) {
        false
      } else if (n < 0) {
        even(-n)
      } else {
        even(n - 2)
      }
    }
  }
}