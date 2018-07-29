package com.problem

object P05 extends App {

  // P05 (*) Reverse a list.
  //     Example:
  //     scala> reverse(List(1, 1, 2, 3, 5, 8))
  //     res0: List[Int] = List(8, 5, 3, 2, 1, 1)

  val list = List(1, 2, 3, 4, 5, 6)

  //1.
  println(list.reverse)

  //2.

  def reverseList[T](list: List[T]): List[T] = {
    var reversedList = List[T]()
    list.map(n => {
      reversedList = n :: reversedList
    })
    reversedList
  }

  println(reverseList(list))

}
