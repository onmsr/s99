package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P16 {
  def drop[T](n:Int, l:List[T]):List[T] = l.zipWithIndex.filter { case (e, i) => ((i+1)%n != 0)} map {_._1}
  def main(args: Array[String]) {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
