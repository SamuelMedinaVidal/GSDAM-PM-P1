package main.kotlin

class Furgoneta (
    matricula: String,
    marca: String,
    precioPorDia: Double,
    val capacidadCargaKg: Int
) : Vehiculo (matricula, marca, precioPorDia) {
    override fun describir() : String = "${super.describir()} $capacidadCargaKg capacidadCargaKg"
}