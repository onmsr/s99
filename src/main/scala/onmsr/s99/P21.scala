package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P21 {
  def split[T](n:Int, l:List[T]): (List[T], List[T]) =
    if (n == 0) (Nil, l)
    else split(n-1, l.tail) match { case (l1, l2) => (l.head :: l1, l2) }

  def insertAt[T](e:T, n:Int, l:List[T]):List[T] = split(n, l) match { case (l1, l2) => l1 ::: e :: l2 }

  def main(args: Array[String]) {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }
}
