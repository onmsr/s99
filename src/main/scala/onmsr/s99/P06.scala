package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/25.
 */
object P06 {
  def isPalindrome[T](l: List[T]): Boolean = l match {
    case h :: Nil => true
    case h :: rest => if (h.equals(rest.last)) isPalindrome(rest.dropRight(1)) else false
    case _ => true
  }

  def main(args: Array[String]) {
    println(isPalindrome(List(1, 2).toList))
    println(isPalindrome(List(1, 2, 2, 1).toList))
    println(isPalindrome(List(1, 2, 3, 2, 1).toList))
  }
}
