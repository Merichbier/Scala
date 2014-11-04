import java.lang.management.ManagementFactory

object Solution {


  def solve(aLine : String): Unit = {
    val nb = aLine.toInt
    val rest = nb%3
    val possibleFive = ((nb-rest) to 0 by -3).toStream

    def theOne(nb:Int, five : Stream[Int]) : Int = {
      if(five.isEmpty) 0
      else if((nb -five.head)%5 == 0) five.head
      else theOne(nb,five.tail)
    }
    val CorrectFive = theOne(nb, possibleFive)
    if(CorrectFive  == 0 && nb%5!= 0) println("-1")
    else println("5" * CorrectFive + "3"* (nb-CorrectFive) )
  }

  def main(args: Array[String]) {
    //val beginTime = ManagementFactory.getThreadMXBean.getCurrentThreadCpuTime
    val nbTests = Console.readInt

      (1 to nbTests) map ( x => solve(Console.readLine()))
    //val endTime = ManagementFactory.getThreadMXBean.getCurrentThreadCpuTime

  }
}