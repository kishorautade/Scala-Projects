package com.problem

import java.util.NoSuchElementException

object P01 extends App {

  // P01 (*) Find the last element of a list.
  //     Example:
  //     scala> last(List(1, 1, 2, 3, 5, 8))
  //     res0: Int = 8

  val numbers = List(1, 2, 3, 4)
  val strings = List("Mumbai", "Pune", "Kolhapur")

  def last[A](list: List[A]): A = list.last

  println(last(numbers))
  println(last(strings))

  def lastByRecursion[B](list: List[B]): B = {

    list match {
      case lastElement :: Nil => lastElement
      case _ :: remainingList => lastByRecursion(remainingList)
      case _ => throw new NoSuchElementException
    }

  }
  println(lastByRecursion(numbers))
}
