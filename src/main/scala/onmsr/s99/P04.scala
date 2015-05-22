package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/22.
 */
object P04 {
  def length[T](l:List[T]):Int = l match {
    case Nil => 0
    case _::rest => 1 + length(rest)
    case _ => throw new Exception("error")
  }
  def main(args: Array[String]) {
    println(length((1 to 10).toList))
    println(length(List()))
  }
}
