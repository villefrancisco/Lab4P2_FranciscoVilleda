
package lab4p2_franciscovilleda_12111170;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab4P2_FranciscoVilleda_12111170 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Escuadron> escuadrones = new ArrayList();
        ArrayList<Zonas> zonas = new ArrayList();
        
        int opcion = -1;
        while(opcion != 0){
            try{
                opcion = menu();
            }
            catch(Exception ex){
                sc.next();
                System.out.println("Ingrese un valor numerico");
            }
            switch(opcion){
                case 1:{
                    try{
                        crearZona(zonas);
                    }catch(Exception x){
                        System.out.println("La zona no pudo ser creada. " + x.getMessage());
                    }
                    sc.nextLine();
                }
                break;
                
                case 2:{
                    for (Zonas temp : zonas) {
                        System.out.println(zonas.indexOf(temp) +") " + temp);
                    }
                }
                break;
                
                case 3:{
                    crearEscuadron(escuadrones);
                }
                break;
                
                case 4:{
                    for (Escuadron temp : escuadrones) {
                        System.out.println(escuadrones.indexOf(temp)+") "+temp);
                    }
                }
                break;
                
                case 5:{
                    
                }
                break;
                
                default:
                    System.out.println("Su opcion debe estar entre 0 y 11");
                    break;
            }
            
        }
    }
    
    public static int menu(){
        System.out.println("MENU GYM");
        System.out.println("0 - Salir");
        System.out.println("1 - Crear Zona");
        System.out.println("2 - Listar Zonas");
        System.out.println("3 - Crear Escuadrones");
        System.out.println("4 - Listar Escuadrones");
        System.out.println("5 - Listar escuadron");
        System.out.println("6 - Eliminar Escuadron");
        System.out.println("7 - Añadir soldado a escuadron");
        System.out.println("8 - Listar soldados de escuadron");
        System.out.println("9 - Listar soldados de escuadron por tipo");
        System.out.println("10 - Eliminar soldados de escuadron");
        System.out.println("11 - Pelear");
        System.out.println("Ingrese su opcion: ");

        int opcion = sc.nextInt();
        return opcion;
    }
    
    public static void crearZona(ArrayList<Zonas> zonas) throws Exception{
        System.out.println("Ingrese el nombre de la zona");
        String n = sc.next();
        System.out.println("Ingrese el tamaño de la zona");
        int tam = sc.nextInt();
        System.out.println("Ingrese las coordenadas x");
        int x = sc.nextInt();
        System.out.println("Ingrese las coordenadas y");
        int y = sc.nextInt();
        Zonas z = new Zonas(n, tam, x, y);
        zonas.add(z);
    }
    
    public static void crearEscuadron(ArrayList<Escuadron> esc){
        System.out.println("Ingrese el nombre del escuadron: ");
        String n = sc.nextLine();
        n = sc.nextLine();
        esc.add(new Escuadron(n));
    }
}
