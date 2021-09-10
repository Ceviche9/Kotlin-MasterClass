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
