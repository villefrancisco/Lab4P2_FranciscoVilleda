
package lab4p2_franciscovilleda_12111170;

public class Capitan extends Soldado{
    private Armas arma = new Armas("Lanzallamas", 110);

    public Capitan() {
    }

    public Capitan(String nombre, int edad, String rango, double hp, int tiempoejercito) throws Exception {
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
        double damage = arma.getDaño();
        if(s instanceof InfLigera)
            damage *= 0.25;
        else if(s instanceof InfPesada)
            damage *= 0.20;
        else if(s instanceof Sargento)
            damage *= 0.15;
        return damage;
    }
}
