package onmsr.s99

/**
  * Created by masaru_onuma on 2015/05/22.
  */
object P03 {

  def nth[T](k:Int, l:List[T]):T = (k, l) match {
    case (0, e::_) => e
    case (_, _::rest) => nth(k-1, rest)
    case (_, _) => throw new Exception("error!")
  }

  def main(args: Array[String]) {
    println(nth(2, List(1,1,2,3,5,8)))
    println(nth(0, (1 to 10).toList))
  }
}
