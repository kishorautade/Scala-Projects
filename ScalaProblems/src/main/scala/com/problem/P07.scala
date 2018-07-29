package com.problem

object P07 extends App{

  // P07 (**) Flatten a nested list structure.
  //     Example:
  //     scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  //     res0: List[Any] = List(1, 1, 2, 3, 5, 8)

  val listOfLists=List(1,List(1,3),List(4,7))

  //1.
  //println(listOfLists.flatten)

  //2.
  def flatten[T](list:List[T]): List[T] ={
    var flattenedList=List[T]()
    list.map(n => n match {
      case k:List[T]=>flattenedList=flattenedList:::k
      case m=> flattenedList=m::flattenedList
    })
    flattenedList
  }

  println(flatten(listOfLists))
}
