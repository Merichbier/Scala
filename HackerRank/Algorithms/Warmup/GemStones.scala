object Solution {

  def findCommonGem(gems :List[String]) : Int ={
    (gems map  (_.distinct) flatten).groupBy(x => x).filter(_._2.size >= gems.size).size
  }
  //_.distinct drop double element in gem
  // flatten group all gems in one
  // groupBy group element so we have elem -> List(elem*)
  // filter take only elem whose list.size is bigger/equal than number of gems
  // the lenght of this list is our number of commun gem

  def main(args: Array[String]) {
    val nbGem = Console.readInt
    println (findCommonGem((1 to nbGem) map (x=> Console.readLine) toList))
  }
}