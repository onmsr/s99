package onmsr.s99

/**
 * Created by masaru_onuma on 2015/05/27.
 */
object P22 {
  //def range(s:Int, e:Int):List[Int] = (s to e).toList
  def range(s:Int, e:Int):List[Int] = if((e-s) != -1) s::range(s+1, e) else Nil
  def main(args: Array[String]) {
    println(range(4, 9))
  }
}
