object Solution {


  def maxXor(l: Int, r: Int): Int = {

    ((l to r) flatMap(a => (l to r) map(b => a ^ b))).max
  }

  def main(args: Array[String]) {
    var _l:Int = Console.readInt


    var _r:Int = Console.readInt


    val res =         maxXor(_l, _r)
    println(res)


  }
}
