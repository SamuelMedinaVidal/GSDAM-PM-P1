package main.kotlin

fun main(){

    /* Al pasar al ejercicio 3, me he encontrado con la situación que al ejecutar el código, independientemente
    de utilizar la propiedad 'toString()' o no en mi código al imprimir, la consola me aportaba un número alfanumérico.

    Utilizando la Inteligencia Artificial de Gemini he comprendido que he de utilizar la propiedad 'override' sobre mi
    código relacionado con el String de Vehículo, en este caso, he estado trabajando con la función creada 'describir'
    y he ido haciendo modificaciones(sobreescrituras) de esta función en las clases implementeadas a Vehículo.
    Por lo tanto, para modificar la propiedad 'toString()' de manera que muestre en consola la función 'describir', se
    ha sobreescrito la función 'toString' en la clase Vehículo devolviendo la función 'describir'*/
    val toyotaCorolla = Turismo(matricula = "1234ABC", marca = "Toyota", precioPorDia = 5.0, plazas = 5 )
    //println(toyotaCorolla.toString())
    val opelCorsa = Turismo(matricula = "2345DEF", marca = "Opel", precioPorDia = 5.5, plazas = 5 )
    val citroenC3 = Furgoneta(matricula = "3456GHI", marca = "Citroen", precioPorDia = 4.0, capacidadCargaKg = 500 )
    val nissanKangoo = Furgoneta(matricula = "7891JKL", marca = "Nissan", precioPorDia = 6.0, capacidadCargaKg = 1000)

    // Creamos una lista variable con los vehículos
    val flota = mutableListOf(toyotaCorolla, citroenC3, nissanKangoo, opelCorsa)

    // Creamos una SetList para las marcas, de tipo String
    val marcas = mutableSetOf<String>()

    // Se itera sobre la lista 'flota' para ir añadiendo las marcas existentes a la SetList 'marcas'
    for (i in flota) {
        marcas.add(i.marca)
    }

    val kilometraje = mutableMapOf<String, Double>(
        "1234ABC" to 143000.3,
        "2345DEF" to 70000.0,
        "3456GHI" to 843.2,
        "7891JKL" to 0.0)

    println(kilometraje["1234ABC"])

    val reservaSemana = intArrayOf(9, 10, 3, 5, 2, 9, 0)
    println(reservaSemana.sum())
    var reservaAlta = 0
    var indiceReserva = 0
    for (i in reservaSemana.indices) {
        if (reservaSemana[i] > reservaAlta) {
            reservaAlta = reservaSemana[i]
            indiceReserva = i
        }
    }
    print("El día con más reservas es el día: ${indiceReserva} con un total de: ${reservaSemana[indiceReserva]} reservas")
}