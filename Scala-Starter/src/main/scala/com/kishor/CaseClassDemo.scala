package com.kishor

object CaseClassDemo extends App {

  case class Note( name: String, age: Int)

  val note=Note("Kishor",28)
  println(note.toString)

  def identifyNote(note:Note): String = note match {
    case Note("Kishor",age) => "This is Kishor"
    case Note("Aahil",26) => "This is Aahillll"
    case Note(name,age) => "This is "+name
    case _ => "Not found"

  }
  println(identifyNote(Note("Aahil",26)))

  def identifyOption(opt:Option[String]): Option[String] = opt match {
    case Some(value) => Some("Value "+value+" Exist")
    case None => Some("No value exist")
  }

  println(identifyOption(Some("Hello")).get)
}
