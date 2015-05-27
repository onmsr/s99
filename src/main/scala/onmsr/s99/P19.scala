package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P19 {
  def split[T](n:Int, l:List[T]): (List[T], List[T]) =
    if (n == 0) (Nil, l)
    else split(n-1, l.tail) match { case (l1, l2) => (l.head :: l1, l2) }

  def slice[T](s:Int, e:Int, l:List[T]):List[T] = split(e - s, split(s, l)._2)._1

  def rotate[T](n:Int, l:List[T]):List[T] = slice(n, l.size, l) ::: slice(0, n, l)

  def main(args: Array[String]) {
    println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
}
