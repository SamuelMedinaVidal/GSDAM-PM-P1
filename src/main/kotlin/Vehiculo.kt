package main.kotlin

open class Vehiculo (
    val matricula: String,
    val marca: String,
   // Ponemos 'override' para sobreescribir la propiedad de la interfaz poe el valor correspondiente
    override val precioPorDia: Double
) : Alquilable {
    // Una interfaz no puede tener backing field ya que esta no se instancia, tiene que calcular el valor cada vez que se lee
    open fun describir(): String = "$marca($matricula) - ${precioPorDia}€/dia"
}