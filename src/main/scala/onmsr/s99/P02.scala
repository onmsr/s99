package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/22.
 */
object P02 {

  def penultimate[T](l:List[T]):T = l match {
    case p::_::Nil => p
    //case e::Nil => e
    case _::rest => penultimate(rest)
    case _ => throw new Exception("error!")
  }

  def main(args: Array[String]) {
    println(penultimate((1 to 10).toList))
//    println(penultimate(List(1)))
//    println(penultimate(List()))
  }
}
