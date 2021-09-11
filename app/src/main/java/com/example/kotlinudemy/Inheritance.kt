package com.example.kotlinudemy

fun main() {
  val myCar = NewCar(200.0, "A3", "Audi")
  val myECar = ElectricCar(200.0, "S-Model","Tesla", 57.9)

  myECar.extendRange(200.00)

  myECar.drive()

  // Polymorphism
  myCar.drive(200.00)
  myECar.drive(200.0)
  // Usando um método da interface
  myCar.brake()
}
// A interface funciona como um contrato que a classe tem que seguir
interface  Drivable {
  val maxSpeed: Double
  fun drive(): String
  // A função brake já é implementada por padão na função
  fun brake() {
    println("The drivable is braking")
  }
}
// Para utilizar os métodos e propriedades dessa classe precisamos colocar o "open"
// NewCar => Super Class
open class NewCar (override val maxSpeed: Double,
                   val name: String, val brand: String): Drivable {
  // Para permitir que uma propriedade possa ser sobreescrita.
  open var range: Double = 0.0

  fun extendRange(amount: Double) {
    if(amount > 0 )
      range += amount
  }

  override fun drive(): String {
    return "Driving the interface drive"
  }

  // Para permitir que um método seja sobreescrito
  open fun drive(distance: Double){
    println("The ${this.name}, Drove for $distance Km" )
  }

}
// O carro elétrico pode ter os parâmetros da sua super classe e também pode ter parâmetreos adicionais.
class ElectricCar(maxSpeed: Double,name: String, brand: String, batteryLife: Double): NewCar(maxSpeed, name, brand) {

  //Para sobreescrever algo da Super classe
  override var range = batteryLife * 6

  // Método que foi sobreescrito
  override fun drive(distance: Double) {
    println("Drove for $distance KM on electricity")
  }
  // Método que foi criado
  override fun drive(): String {
    return "Drove for $range KM on electricity"
  }

}
