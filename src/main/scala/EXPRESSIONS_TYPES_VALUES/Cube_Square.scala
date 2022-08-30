package EXPRESSIONS_TYPES_VALUES


//Define an object called calc with a method square that accepts a Double as an argument and... you guessed it.
//.. squares its input. Add a method called cube that cubes its input calling square as part of its result calcula􏰀on.
class Cube_Square {

}

object calc {
  def square(num:Double) = {
    val result = num * num
    println(result)
  }
  def cube(num:Double): Unit = {
    val result= num* num * num
    println(result)
  }
}
object main extends App {
  calc.square(9.8)
  calc.cube(8)

}