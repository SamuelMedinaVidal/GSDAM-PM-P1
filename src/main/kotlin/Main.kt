package main.kotlin

fun main(){

    /* Al pasar al ejercicio 3, me he encontrado con la situación que al ejecutar el código, independientemente
    de utilizar la propiedad 'toString()' o no en mi código al imprimir, la consola me aportaba un número alfanumérico.

    Utilizando la Inteligencia Artificial de Gemini he comprendido que he de utilizar la propiedad 'override' sobre mi
    código relacionado con el String de Vehículo, en este caso, he estado trabajando con la función creada 'describir'
    y he ido haciendo modificaciones(sobreescrituras) de esta función en las clases implementeadas a Vehículo.
    Por lo tanto, para modificar la propiedad 'toString()' de manera que muestre en consola la función 'describir', se
    ha sobreescrito la función 'toString' en la clase Vehículo devolviendo la función 'describir'*/
    val toyotaCorolla = Vehiculo(matricula = "1234ABC", marca = "Toyota", precioPorDia = 5.0 )

    println(toyotaCorolla.toString())
}