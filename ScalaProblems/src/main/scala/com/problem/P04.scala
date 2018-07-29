package com.problem

object P04 extends App {

  // P04 (*) Find the number of elements of a list.
  //     Example:
  //     scala> length(List(1, 1, 2, 3, 5, 8))
  //     res0: Int = 6

  val list = List(1, 2, 3, 4, 5, 6)

  //1.
  println(list.length)

  //2.
  var result = 0

  def lenghtByRecursion[T](list: List[T]): Int = {
    list match {
      case Nil => result
      case _ :: tail => {
        result += 1
        lenghtByRecursion(tail)
      }
    }
  }

  println(lenghtByRecursion(list))

  //3.
  result=0
  println(result)
  list.map(_ => {result+=1})

  println(result)

}
