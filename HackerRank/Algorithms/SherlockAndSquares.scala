object Solution {

  def solve(aLine : String): Int = {
    val splitLine = aLine.split(' ')
    val start = splitLine(0).toInt

    val end = splitLine(1).toInt

    val first = math.ceil(math.sqrt(start)).toInt

    if(first*first > end) 0
    else (first to end).toStream.takeWhile(x => x*x <= end).length
  }

  def main(args: Array[String]) {
    val nbTests = Console.readInt

    val born =

    (1 to nbTests) map ( x => println(solve(Console.readLine())))

  }
}