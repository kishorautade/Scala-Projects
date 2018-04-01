package com.kishor

object ControlAndFunctions extends App{

  println("Hello")
  //1
  for(i<-1 to 10){
    print(i+" ")
  }
  //2
  val s="Hello"
  var sum=0
  for(i<-0 to s.length-1){
    sum+=s(i)
  }
  println(sum)

  //3
  for(ch<-s){
    sum+=ch
  }
  println(sum)

  //4
  for(i <- 1 to 3;j <- 1 to 3) println("i "+i+" j "+j )

  //5
  println("//5")
  for(i <- 1 to 3;j <- 1 to 3 if i !=j) println("i "+i+" j "+j )

  //6
  println("//6")
  for(i <- 1 to 3;from = 4-i;j <- from to 3) println("i "+i+" j "+j )

  //7
  println("//7")
  val out=for(i <- 1 to 10 if i%2==0) yield i
  println(out)

  //8
  println("//8")
  val out1=for(c <- "Hello";i <- 0 to 1) yield (c+i).toChar
  println(out1)

  //9 generated collection is compatible with first generator
  println("//9")
  val out2=for(i <- 0 to 1;c <- "Hello") yield (c+1).toChar
  println(out2)

  //10 function
  println("//10")
  def abs(x: Double)={if (x>=0) x else -x} //or def abs(x:Double):Int=if (x>0) x else -x
  println(abs(-10))

  //11 function default arguments
  println("//11")
  def decorate(str:String,left:String="[",right:String="]"):String = left+str+right
  println(decorate("Kishor","<",">"))
  println(decorate("Kishor")) //default argument
  println(decorate("Kishor","<")) //right takes default
  println(decorate("Kishor",right=">")) //named argument no order required, unnamed should come first

  //12 variable arguments
  println("//12")
  def addAll(args:Int *)={
    var sum :Int=0
    for(arg<- args) sum+=arg
    sum
  }
  println(addAll(1,2,3,4,5))
}
