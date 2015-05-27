package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P14 {
  def duplicate[T](l:List[T]):List[T] = l.flatMap(List.fill(2)(_))
  def main(args: Array[String]) {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  }
}
