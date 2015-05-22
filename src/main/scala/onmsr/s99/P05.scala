package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/22.
 */
object P05 {
  def reverse[T](l:List[T]):List[T] = l match {
    case h::rest => reverse(rest) ::: List(h)
    case Nil => Nil
    case _ => throw new Exception("error")
  }

  def main(args: Array[String]) {
    println(reverse((1 to 10).toList))
  }
}
