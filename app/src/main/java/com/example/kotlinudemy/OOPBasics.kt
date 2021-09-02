package com.example.kotlinudemy

fun main() {
  var user = Person("Tundê", "Cavalcante", 21)
  user.hobby = "Play soccer"
  user.stateHobby()
}

class Person (firstName: String = "Undefined", lastName: String = "NoLastName") {

  //Member Variables - Properties
  var age: Int? = null
  var hobby: String = "Watch Netflix"

  // Initializer Block
  init {
    println("New User created, Welcome $firstName")
  }

  // Secondary Constructor
  constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
    this.age = age
  }

  // Methods - Member Functions
  fun stateHobby() {
    println("My hooby is $hobby")
  }

}