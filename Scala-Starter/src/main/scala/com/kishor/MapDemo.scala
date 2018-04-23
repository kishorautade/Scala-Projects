package com.kishor

object MapDemo extends App {

  val cities=Seq("Pune","Mumbai","Kolhapur")
  println(cities.map(_.toUpperCase))
  println(cities.flatMap(_.toUpperCase))
  println(cities.flatMap("'"+_+"'"))


  def justAppendSomething(str:String):String ={
    str+" !!"
  }

  println(cities.map(justAppendSomething))

  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      // catch Exception to catch null 's'
      case e: Exception => None
    }
  }
  val strings = Seq("1", "2", "foo", "3", "bar")
  println(strings.map(toInt))
  println(strings.flatMap(toInt))
  println(strings.flatMap(toInt).sum)

  //
   val list = List(1,2,3,4,5)
   def g(v:Int) = List(v-1, v, v+1)
   list.map(x => g(x))
   list.flatMap(x => g(x))
  //
}
