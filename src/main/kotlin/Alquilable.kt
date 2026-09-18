package main.kotlin

interface Alquilable {
    val precioPorDia: Double // propiedad abstracta, no le damos valor

    fun calacularPrecioTotal(dias: Int): Double {
        return precioPorDia * dias
    }

}