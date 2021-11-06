
package lab4p2_franciscovilleda_12111170;
public class InfPesada extends Soldado{
    private Armas arma = new Armas("Bomba", 150);

    public InfPesada() {
    }

    public InfPesada(String nombre, int edad, String rango, double hp, int tiempoejercito) throws Exception {
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
        return super.toString() + " " + "InfPesada ";
    }
    
    public double atacar(Soldado s){
        double damage =arma.getDaño();
        if(s instanceof InfLigera)
            damage *= 0.05;
        return damage;
    }
}
