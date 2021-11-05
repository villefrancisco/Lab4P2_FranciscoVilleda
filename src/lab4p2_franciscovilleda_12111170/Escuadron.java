
package lab4p2_franciscovilleda_12111170;
import java.util.ArrayList;

public class Escuadron {
    private String nombre;
    private ArrayList<Zonas> zonas = new ArrayList();
    private ArrayList<Soldado> soldados = new ArrayList();

    public Escuadron(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Zonas> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zonas> zonas) {
        this.zonas = zonas;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", zonas=" + zonas + ", soldados=" + soldados + '}';
    }
    
}
