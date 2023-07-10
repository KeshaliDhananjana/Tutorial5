object Q5_5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number:");
    val number = scala.io.StdIn.readInt();
    print(evenSum(number))
  }

  def evenSum(n: Int): Int ={
    if(n <= 0){
      0
    }
    else if(n % 2 == 0){
      n + evenSum(n - 2)
    }
    else{
      evenSum(n - 1)
    }
  }
}