package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P25 {

  def removeAt[T](n:Int, l:List[T]):(List[T], T) = (l.zipWithIndex.filter(_._2 != n).map(_._1), l(n))
  def randomSelect[T](n:Int, l:List[T]):List[T] =
    if (n == 0) Nil else removeAt((new util.Random).nextInt(l.size), l) match { case (l2, e) => e :: randomSelect(n-1, l2) }

  def randomPermute[T](l:List[T]):List[T] = if (l.isEmpty) Nil else
    randomSelect(1, l.zipWithIndex).head match { case (e, n) => e :: randomPermute(removeAt(n, l)._1)}

  def main(args: Array[String]): Unit = {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

}
