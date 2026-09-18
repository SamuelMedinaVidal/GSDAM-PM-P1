package main.kotlin

open class Vehiculo (
    val matricula: String,
    val marca: String,
    val precioPorDia: Double
){
    open fun describir(): String = "$marca($matricula) - ${precioPorDia}€/dia"
}