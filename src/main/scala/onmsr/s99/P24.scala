package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P24 {

  def range(s:Int, e:Int):List[Int] = if((e-s) != -1) s::range(s+1, e) else Nil
  def removeAt[T](n:Int, l:List[T]):(List[T], T) = (l.zipWithIndex.filter(_._2 != n).map(_._1), l(n))
  def randomSelect[T](n:Int, l:List[T]):List[T] =
    if (n == 0) Nil else removeAt((new util.Random).nextInt(l.size), l) match { case (l2, e) => e :: randomSelect(n-1, l2) }

  def lotto[T](n:Int, max:Int):List[Int] = randomSelect(n, range(0, max))

  def main(args: Array[String]) {
    println(lotto(6, 49))
  }

}
