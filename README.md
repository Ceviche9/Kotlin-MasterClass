<h1 align="center">
  <img alt="Kotlin" src="https://upload.wikimedia.org/wikipedia/commons/7/74/Kotlin_Icon.png" width="120px" />
</h1>

<h3 align="center">
  Kotlin, MasterClass
</h3>

<p align="center">Here you can find some of my studies and notes about Kotlin.</p>

## Kotlin Fundamentals

You can find it in:
> app > src > main > kotlinudemy > KotlinBasics.kt 

```kt

fun main() {
  // Below you can see some of kotlin's primitive types
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

  // Arithmetic operators (+, -, *, /,%)

  // Comparison Operators (==, !=, > , < , <= , >=)

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

  // Creating a variable with a value
  val season = 3
  when(season) {
    // If the value of the variable season is 1, Spring will be printed
    1 -> println("Spring")
    2 -> println("Summer")
    3 -> {
      println("Fall")
      println("Autumn")
    }
    4 -> println("end")
    else -> println("Invalid season")
  }
  // Another example
  val month = 3
  when(month) {
    // Creating a Range
    in 3..5 -> println("Spring")
    in 6..8 -> println("Summer")
    else -> println("Invalid season =")
  }

  // Another example
  val x : Any = 13.37
  when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
  }
  
  // While loop
  var condition = 1
  while(condition <= 4) {
    println("The value of condition is $condition")
    condition += 1
  }

  // For loops
  for (num in 1..10) {
    print("$num")
  }

  for(i in 10 downTo 1 step 2) {
    print("$i")
  }

}
```

## Kotlin Functions
You can find it in:
> app > src > main > kotlinudemy > KotlinFuntions.kt 

```kt
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
```

## Kotlin OOP Basics
You can find it in:
> app > src > main > kotlinudemy > OOPBasics.kt

```kt
  
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
```
## Kotlin OOP Getters and Setters
You can find it in:
> app > src > main > kotlinudemy > GetterAndSetter.kt

```kt
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
```
## Kotlin OOP Inheritance and Interface
You can find it in:
> app > src > main > kotlinudemy > Inheritance.kt

```kt
package com.example.kotlinudemy

fun main() {
  val myCar = NewCar("A3", "Audi")
  val myECar = ElectricCar("S-Model", "Tesla",85.0)

  myECar.extendRange(200.00)

  myECar.drive()

  // Polymorphism
  myCar.drive(200.00)
  myECar.drive(200.0)
}

// Para utilizar os métodos e propriedades dessa classe precisamos colocar o "open"
// NewCar => Super Class
open class NewCar (val name: String, val brand: String) {
  // Para permitir que uma propriedade possa ser sobreescrita.
  open var range: Double = 0.0

  fun extendRange(amount: Double) {
    if(amount > 0 )
      range += amount
  }

  // Para permitir que um método seja sobreescrito
  open fun drive(distance: Double){
    println("The ${this.name}, Drove for $distance Km" )
  }

}
// O carro elétrico pode ter os parâmetros da sua super classe e também pode ter parâmetreos adicionais.
class ElectricCar(name: String, brand: String, batteryLife: Double): NewCar(name, brand) {

  //Para sobreescrever algo da Super classe
  override var range = batteryLife * 6

  // Método que foi sobreescrito
  override fun drive(distance: Double) {
    println("Drove for $distance KM on electricity")
  }
  // Método que foi criado
  fun drive() {
    println("Drove for $range KM on electricity")
  }

}
```

