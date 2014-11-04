object Solution {

  def solve(k : BigInt): BigInt = {
    val n: BigInt =  k/2
    n * (k-n)
  }


  def main(args: Array[String]) {
    val nbTests = Console.readInt()

    (1 to nbTests) map(x=> println(solve(BigInt(Console.readLine))))
  }
}