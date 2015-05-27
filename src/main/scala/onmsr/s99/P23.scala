package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P23 {
  def split[T](n:Int, l:List[T]): (List[T], List[T]) =
    if (n == 0) (Nil, l)
    else split(n-1, l.tail) match { case (l1, l2) => (l.head :: l1, l2) }

  def slice[T](s:Int, e:Int, l:List[T]):List[T] = split(e - s, split(s, l)._2)._1

  def removeAt[T](n:Int, l:List[T]):(List[T], T) = (l.zipWithIndex.filter(_._2 != n).map(_._1), l(n))

  def randomSelect[T](n:Int, l:List[T]):List[T] =
    if (n == 0) Nil else removeAt((new util.Random).nextInt(l.size), l) match { case (l2, e) => e :: randomSelect(n-1, l2) }

  /*
  def randomSelect[T](n:Int, l:List[T]):List[T] = (n, removeAt((new util.Random).nextInt(l.size), l)) match {
    case (0, _) => Nil
    case (_, (l2, e)) => e :: randomSelect(n-1, l2)
  }*/

  def main(args: Array[String]) {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }
}
