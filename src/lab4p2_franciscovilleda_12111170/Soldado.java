
package lab4p2_franciscovilleda_12111170;
public class Soldado {
    private String nombre;
    private int edad;
    private String rango;
    private double hp;
    private int tiempoejercito;

    public Soldado() {
    }

    public Soldado(String nombre, int edad, String rango, double hp, int tiempoejercito) throws Exception{
        this.nombre = nombre;
        this.edad = edad;
        this.rango = rango;
        this.setHp(hp);
        this.tiempoejercito = tiempoejercito;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) throws Exception {
        if(hp > 400 || hp < 100){
            throw new Exception("Los puntos de vida no estan en el rango 100 - 400");
        }
        this.hp = hp;
    }

    public int getTiempoejercito() {
        return tiempoejercito;
    }

    public void setTiempoejercito(int tiempoejercito) {
        this.tiempoejercito = tiempoejercito;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", edad=" + edad + ", rango=" + rango + ", hp=" + hp + ", tiempoejercito=" + tiempoejercito + '}';
    }
    
    public double atacar(Soldado s){
        return 0;
    }
}
