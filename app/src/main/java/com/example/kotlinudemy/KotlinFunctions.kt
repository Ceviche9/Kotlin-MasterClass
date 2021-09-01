package com.example.kotlinudemy


// THe main function is the entry point of the program
fun main() {
  myFunction()
}

// Parameter
fun addUp(a: Int, b: Int): Unit {
  val s = a + b
  return println("The result is $s")
}

fun myFunction() {
  addUp(20, 30)
}