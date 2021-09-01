package com.example.kotlinudemy

fun main() {
  // TODO: adicionar nova funcionalidade
  // Abaixo é possivel ver alguns tipos primitivos do kotlin
  // type String
  val myName: String = "Tundê"
  // type Int
  val myAge: Int = 21
  // type Float
  val myPeso: Float = 60.5F
  // type Boolean
  var isSunny: Boolean = true
  isSunny = false
  // type Character
  val lettlerChar = 'A'
  val numberChar = '2'

  // String
  val mySr = "Hello World"
  val firstLetter = mySr[mySr.length - 1]
  println(firstLetter)

  println("Olá, " + myName)
}