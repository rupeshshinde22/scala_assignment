package EXPRESSIONS_TYPES_VALUES

class Test1 {
  val chapter = 22

  def test(): Unit = {
    println("hii")

  }

  def test1(): String = {
    "hii"

  }
}

object test2 extends App{
  val a=new Test1
  a.test()
  println(a.test1())
}