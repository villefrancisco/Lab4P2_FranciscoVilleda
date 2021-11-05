
package lab4p2_franciscovilleda_12111170;
public class Sargento extends Soldado{
    private Armas arma = new Armas("Escopeta", 140);

    public Sargento() {
    }

    public Sargento(String nombre, int edad, String rango, double hp, int tiempoejercito) throws Exception {
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
        double damage =arma.getDaño();
        if(s instanceof InfLigera)
            damage *= 0.15;
        else if(s instanceof InfPesada)
            damage *= 0.10;
        return damage;
    }
}
