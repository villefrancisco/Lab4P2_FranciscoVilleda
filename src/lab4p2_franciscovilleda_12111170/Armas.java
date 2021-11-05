
package lab4p2_franciscovilleda_12111170;
public class Armas {
    private String nombre;
    private double daño;

    public Armas() {
    }

    public Armas(String nombre, double daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Armas{" + "nombre=" + nombre + ", da\u00f1o=" + daño + '}';
    }
    
}
