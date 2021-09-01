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

}
```

## OOP Basics
