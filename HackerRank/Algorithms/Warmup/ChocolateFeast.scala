object Solution {

  def solve(input : Array[String]) : Int = {
    def discountWrappers(wrap :Int, discount : Int) : Int = {
      if(wrap < discount) 0
      else {
        val moreWrap = wrap / discount
        moreWrap + discountWrappers(wrap - moreWrap * discount + moreWrap, discount)
      }
    }
    val wrappers : Int= input(0).toInt/input(1).toInt
    wrappers + discountWrappers(wrappers,input(2).toInt)
  }

  def main(args: Array[String]) {
    val nbTests = Console.readInt

    (1 to nbTests) map (x=> println(solve(Console.readLine.split(' '))))
  }
}