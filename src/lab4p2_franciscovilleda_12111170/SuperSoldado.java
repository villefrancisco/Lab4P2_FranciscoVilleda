
package lab4p2_franciscovilleda_12111170;
import java.util.ArrayList;
public class SuperSoldado extends Soldado {
    private ArrayList<Armas> armas = new ArrayList();

    public SuperSoldado(String nombre, int edad, String rango, int tiempoejercito) throws Exception {
        super(nombre, edad, rango, 1000, tiempoejercito);
        armas.add(new Armas("Arma Blanca", 50));
        armas.add(new Armas("Bomba", 150));
        armas.add(new Armas("Escopeta", 140));
        armas.add(new Armas("Lanzallamas", 110));
    }

    public ArrayList<Armas> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Armas> armas) {
        this.armas = armas;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Super Soldado ";
    }
    
    public double atacar(Soldado s){
        double damage = armas.get(0).getDaño();
        if(s instanceof InfLigera)
            damage *= 0.50;
        else if(s instanceof InfPesada)
            damage *= 0.40;
        else if(s instanceof Sargento)
            damage *= 0.35;
        else if(s instanceof Capitan)
            damage *= 0.30;
        return damage;
    }
    
}
