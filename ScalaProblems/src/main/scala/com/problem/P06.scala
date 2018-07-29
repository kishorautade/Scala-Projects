package com.problem

object P06 extends App{

  // P06 (*) Find out whether a list is a palindrome.
  //     Example:
  //     scala> isPalindrome(List(1, 2, 3, 2, 1))
  //     res0: Boolean = true

  val list=List(1,2,3,2,1)
  val rList=list.reverse
  if( list == rList ){
    println("Yes palindrome")
  }else{
    println("Not palindrome")
  }

}
