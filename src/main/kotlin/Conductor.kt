package main.kotlin

/* Java
public class Conductor {
    private String nombre;
    private String numeroLicencia;
    private int aniosExperiencia;
    public Conductor(String nombre, String numeroLicencia, int aniosExperiencia) {
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.aniosExperiencia = aniosExperiencia;
    }
    public String getNombre() { return nombre; }
    public String getNumeroLicencia() { return numeroLicencia; }
    public int getAniosExperiencia() { return aniosExperiencia; }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
*/

/*Kotlin
Las variables nombre y numeroLicencia han de ser val, ya que no tienen un set en su versión de Java y por lo tanto sólo
pueden ser de lectura.
*/
class Conductor(
    val nombre: String,
    val numeroLicencia: String,
    var aniosExperiencia: Int
)