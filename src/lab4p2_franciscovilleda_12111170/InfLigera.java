
package lab4p2_franciscovilleda_12111170;
public class InfLigera extends Soldado{
    private Armas arma = new Armas("Arma Blanca", 50);

    public InfLigera() {
    }

    public InfLigera(String nombre, int edad, String rango, double hp, int tiempoejercito) throws Exception {
        super(nombre, edad, rango, hp, tiempoejercito);
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "InfLigera{" + "arma=" + arma + '}';
    }
    
    public double atacar(Soldado s){
        return arma.getDaño();
    }
}
