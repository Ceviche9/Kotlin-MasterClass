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
  // println(firstLetter)

  // Operadores aritméticos (+, -, *, /,%)

  // Operadores de comparação (==, !=, > , < , <= , >=)

  // If Statement
  val heightPerson1 = 170
  val heightPerson2 = 185

  if (heightPerson1 > heightPerson2) {
    println("Person 1 is taller then person 2")
  }else if(heightPerson1 == heightPerson2) {
    println("the two people are the same height ")
  } else {
    println("Person 2 is taller then person 1")
  }

  // When

  // Criando uma variável com um valor
  val season = 3
  when(season) {
    // Se o valor da variável season for 1 será printado Spring
    1 -> println("Spring")
    2 -> println("Summer")
    3 -> {
      println("Fall")
      println("Autumn")
    }
    4 -> println("end")
    else -> println("Invalid season")
  }
  // Outro exemplo
  val month = 3
  when(month) {
    // Criando um range
    in 3..5 -> println("Spring")
    in 6..8 -> println("Summer")
    else -> println("Invalid season =")
  }

  // Outro exemplo
  val x : Any = 13.37
  when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
  }

}