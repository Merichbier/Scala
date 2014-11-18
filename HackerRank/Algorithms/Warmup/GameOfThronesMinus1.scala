object Solution {

  def main(args: Array[String]) {
    var key = Console.readLine
    val rest = key groupBy(x=> x) filter(_._2.size%2!=0)
    if(rest.size > 1) println("NO")
    else println("YES")
  }
}