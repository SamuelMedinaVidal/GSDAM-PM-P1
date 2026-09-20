# Práctica: Flota de alquiler de vehículos

Este repositorio contiene la solución a los ejercicios de la P1 de la U2

## Tecnologías utilizadas
* Lenguaje: Java-Kotlin
* Entorno: IntelliJ IDEA Ultimate


### Ejercicio 0: Traducción Java -> Kotlin
    * Declaración de propiedades en el constructor primario.
    * Uso de `val` para propiedades de solo lectura (equivalente a atributos sin *setter* en Java) y `var` para propiedades mutables.

### Ejercicio 1: Jerarquía de vehículos (herencia)
    * Modificador `open class` para permitir que una clase sea heredada.
    * Modificador `open fun` para permitir sobrescritura de métodos.
    * Palabra clave `override` para sobrescribir un método del padre.
    * Uso de `:` para definir la herencia.
    * Llamada al constructor del padre mediante `super`.

### Ejercicio 2: Interfaz Alquilable
    * Declaración de `interface` con propiedades abstractas sin *backing field* (sin estado en memoria)
    * Uso de `override val` en el constructor de la clase hija para proporcionar el valor requerido por la interfaz.

### Ejercicio 3: La clase Any
    * Clase base implícita `Any`, raíz de la cual heredan todas las clases en Kotlin (equivalente a `Object` en Java)[cite: 1].
    * Uso de `override fun toString()` para modificar el comportamiento por defecto de la clase `Any` y personalizar la salida por consola[cite: 1, 2].

### Ejercicio 4: Colecciones
    * `mutableListOf()` para crear listas de tamaño dinámico (equivalente a `ArrayList`).
    * `mutableSetOf()` y su función `.add()` para colecciones que garantizan elementos únicos sin repetición.
    * `mutableMapOf()` y el operador `to` para generar estructuras de pares clave-valor (diccionarios) y acceso directo mediante sintaxis de corchetes `mapa["clave"]`.

### Ejercicio 5: Arrays
    * `intArrayOf()` para definir el array de enteros primitivos.
    * Función nativa `.sum()` para realizar cálculos automáticos sobre el array.
    * Propiedad `.indices` para iterar de forma segura sobre las posiciones de un array en un bucle `for` clásico.

### Ejercicio 6: Informe de la flota (Integrador)
    * Bucle `for (item in coleccion)` para iteración directa.
    * Interpolación de *Strings* (`$variable` y `${expresion}`) para formatear la salida de texto de manera limpia.