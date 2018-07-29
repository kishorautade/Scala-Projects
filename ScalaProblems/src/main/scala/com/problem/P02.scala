package com.problem

object P02 extends App{

  // P02 (*) Find the last but one element of a list.
  //     Example:
  //     scala> penultimate(List(1, 1, 2, 3, 5, 8))
  //     res0: Int = 5

  val list=List(1,2,3,4,5)

  def recursiveLastButOne[T](list:List[T]):T={
    list match {
      case lastButOneElement::_::Nil => lastButOneElement
      case elementToSkip::remainingList => recursiveLastButOne(remainingList)
      case _=> throw new NoSuchElementException
    }
  }

  println(recursiveLastButOne(list))

  println(list.reverse.tail.head) //tail returns list except first element
  println(list.init.last) //init returns list except last element

  //:: cons is used to add element at the begining of the list
  //::: is used to concat two lists
  //take(n) takes first n elements in new list

  //takeRight(n) takes last n elements

  println(list.takeRight(2).head)
}
