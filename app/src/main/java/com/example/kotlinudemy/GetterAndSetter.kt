package com.example.kotlinudemy

import java.lang.IllegalArgumentException

fun main() {
  val myCar = Car()
  println("Brand is ${myCar.myBrand} and the Model is ${myCar.Model}")
  // Set
  myCar.maxSpeed = 300
  // Get
  println("Max speed is ${myCar.maxSpeed}")
}

class Car() {
  val myBrand: String = "BMW"
  // Custom getter
    get() {
      return field.toLowerCase()
    }

  var maxSpeed: Int = 250
    set(value) {
      field = if(value > 0) value else throw IllegalArgumentException("Maxspeed can not be last then 0")
    }

  var Model: String = "M5"
    private set

}