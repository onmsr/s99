package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/26.
 */
object P09 {

  def pack[T](l: List[T]): List[List[T]] = packSub(List(), l) match {
    case (pl, Nil) => pl :: Nil
    case (pl, rl)  => pl :: pack(rl)
  }

  def packSub[T](pl:List[T], rl:List[T]):(List[T], List[T]) = (pl, rl) match {
    case (_, Nil) => (pl, Nil)
    case (Nil, h::rest) => packSub(List(h), rest)
    case (h1::rest1, h2::rest2) => if (h1.equals(h2)) packSub(h2::pl, rest2) else (pl, rl)
  }

  def main(args: Array[String]) {
    println(pack(List('a, 'a)))
    println(pack(List( 1, 2, 2, 3, 3, 3, 4, 4, 4)))
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }

}

