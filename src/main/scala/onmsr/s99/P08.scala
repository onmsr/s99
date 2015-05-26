package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/26.
 */
object P08 {

  def compress[T](l: List[T]): List[T] = l match {
    case h::n::rest => if(h.equals(n)) compress(n::rest) else h::compress(n::rest)
    case e => e
  }

  def main(args: Array[String]): Unit = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}


