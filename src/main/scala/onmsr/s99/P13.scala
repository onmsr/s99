package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P13 {

  def encodeDirect[T](l:List[T]): List[(Int, T)] = l.span(l.head.equals(_)) match {
    case (pl @ (h::rest), rl) => (pl.size, h) :: (if (rl.isEmpty) Nil else encodeDirect(rl))
  }

  def main(args: Array[String]) {
    println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}
