object Solution {


  def isPalindrome(word : String): Boolean = {
    if(word.length == 0 || word.length == 1) true
    else if(word.head == word.last) isPalindrome(word.tail.init) else false
  }
  def solve(word : String): Unit = {
    def constructPalindrome(aWord : String, changed : Int): Int = {
      if (isPalindrome(aWord)) changed
      else if (aWord.head == aWord.last) constructPalindrome(aWord.tail.init, changed)
      else if (aWord.head > aWord.last) constructPalindrome((aWord.head.toInt - 1).toChar.toString.concat(aWord.tail), changed + 1)
      else constructPalindrome(aWord.init.concat((aWord.last.toInt - 1).toChar.toString), changed + 1)
    }
    println(constructPalindrome(word,0))

  }

  def main(args: Array[String]) {
    val nbTest :Int = Console.readInt

    (1 to nbTest) map( test => solve(Console.readLine()))
  }
}
