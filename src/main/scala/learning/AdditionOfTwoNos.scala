package learning

object AdditionOfTwoNos {
  def main(args: Array[String]): Unit = {
    var sum = additionOfTwoNos(2,3)
    println("Sum of two numbers is : " + sum)
  }
  def additionOfTwoNos(a:Int,b:Int):Int = {a+b}
}
