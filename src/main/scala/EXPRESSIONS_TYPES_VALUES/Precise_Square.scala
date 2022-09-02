package EXPRESSIONS_TYPES_VALUES

class Precise_Square {

}
object calc2 {
  def square(num:Double) = {
    val result = num * num
    println(result)
  }
  def square(num:Int) = {
    val result = num * num
    println(result)
  }
//  def cube(num:Double): Unit = {
//    val result= num* num * num
//    println(result)
//  }
}
object main1 extends App {
  calc2.square(9.2)
//  calc2.cube(8)

}