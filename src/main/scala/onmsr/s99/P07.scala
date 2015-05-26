package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/26.
 */
object P07 {

  def flatten(l: List[Any]): List[Any] = l match {
    case (h:List[Any])::rest => flatten(h) ::: flatten(rest)
    case h::rest => h :: flatten(rest)
    case v => v
  }

  def flatten2(l: List[Any]): List[Any] = l match {
    case h::rest => {
      (h match {
        case ls:List[Any] => flatten(ls)
        case _ => List(h)
      }) ::: flatten(rest)
    }
    case v => v
  }


  def main(args: Array[String]) {
    println(flatten(List(1, 2)))
    println(flatten(List(1, List(2))))
    println(flatten(List(List(1, 2), 3)))
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}

