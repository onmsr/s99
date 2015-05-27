package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P15 {
  def duplicateN[T](n:Int, l:List[T]):List[T] = l.flatMap(List.fill(n)(_))
  def main (args: Array[String]) {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
}
