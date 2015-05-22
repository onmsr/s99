package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/22.
 */
object P01 {

  def simpleLast[T](l:List[T]):T = l.last

  def last[T](l:List[T]):T = {
    l match {
      case e::Nil => e
      case _::rest => last(rest)
      case _ => throw new Exception("error!")
    }
  }

  def main(args: Array[String]) {
    println(last((1 to 10).toList))
  }
}

