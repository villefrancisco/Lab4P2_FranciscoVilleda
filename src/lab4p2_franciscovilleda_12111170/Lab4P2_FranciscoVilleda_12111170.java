
package lab4p2_franciscovilleda_12111170;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab4P2_FranciscoVilleda_12111170 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        ArrayList<Escuadron> escuadrones = new ArrayList();
        ArrayList<Zonas> zonas = new ArrayList();
        iniciar(zonas, escuadrones);
        
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
                case 0:
                    System.out.println("SALIENDO DEL PROGRAMA");
                    break;
                    
                case 1:{
                    try{
                        crearZona(zonas);
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("La zona no pudo ser creada. " + x.getMessage());
                    }
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
                    try{
                        System.out.println("Ingrese el indice del escuadron");
                        int i = sc.nextInt();
                        ArrayList<Zonas> z = escuadrones.get(i).getZonas();
                        System.out.println(escuadrones.get(i));
                        for (Zonas temp : z){
                            System.out.println(zonas.indexOf(temp) +") " + temp);
                        }
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("El indice se encuentra fuera de rango.");
                    }
                }
                break;
                
                case 6:{
                    try{
                        System.out.println("Ingrese el indice del escuadron a eliminar");
                        int i = sc.nextInt();
                        escuadrones.remove(i);
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("El indice se encuentra fuera de rango.");
                    }
                }
                break;
                
                case 7:{
                    try{
                        System.out.println("Ingrese el indice del escuadron que va a agregar un soldado");
                        int i = sc.nextInt();
                        Escuadron e = escuadrones.get(i);
                        crearSoldado(e.getSoldados());
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("No se pudo agregar el Soldado " + x.getMessage());
                    }
                }
                break;
                
                case 8:{
                    try{
                        System.out.println("Ingrese el indice del escuadron que va a listar");
                        int i = sc.nextInt();
                        Escuadron e = escuadrones.get(i);
                        for (Soldado temp: e.getSoldados()) {
                            System.out.println(e.getSoldados().indexOf(temp)+") " + temp);
                        }
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("No se pudo agregar el Soldado " + x.getMessage());
                    }
                }
                break;
                
                case 9:{
                    try{
                        System.out.println("Ingrese el indice del escuadron que va a listar");
                        int i = sc.nextInt();
                        Escuadron e = escuadrones.get(i);
                        int opcion2 = menuSol();
                        for (Soldado temp: e.getSoldados()) {
                            if(opcion2 == 1 && temp instanceof InfLigera)
                                System.out.println(e.getSoldados().indexOf(temp)+") " + temp);
                            else if(opcion2 == 2 && temp instanceof InfPesada)
                                System.out.println(e.getSoldados().indexOf(temp)+") " + temp);
                            else if(opcion2 == 3 && temp instanceof Sargento)
                                System.out.println(e.getSoldados().indexOf(temp)+") " + temp);
                            else if(opcion2 == 4 && temp instanceof Capitan)
                                System.out.println(e.getSoldados().indexOf(temp)+") " + temp);
                            else if(opcion2 == 5 && temp instanceof SuperSoldado)
                                System.out.println(e.getSoldados().indexOf(temp)+") " + temp);
                        }
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("El indice se encuentra fuera de rango");
                    }
                }
                break;
                
                case 10:{
                    try{
                        System.out.println("Ingrese el indice del escuadron que va a vaciar");
                        int i = sc.nextInt();
                        Escuadron e = escuadrones.get(i);
                        e.getSoldados().clear();
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("El indice se encuentra fuera de rango");
                    }
                }
                break;
                
                case 11:{
                    try{
                        System.out.println("Ingrese el indice del escuadron atacante");
                        int i = sc.nextInt();
                        Escuadron e = escuadrones.get(i);
                        System.out.println("Ingrese el indice del escuadron defensor");
                        int i2 = sc.nextInt();
                        while(i2 == i){
                            System.out.println("Tienen que ser dos escuadrones diferentes");
                            i2 = sc.nextInt();
                        }
                        Escuadron e2 = escuadrones.get(i2);
                        peleas(e, e2);
                        if(e2.getZonas().size() == 0){
                            System.out.println(e2 + "Ha sido eliminado (Se quedo sin zonas)");
                            escuadrones.remove(e2);
                        }
                    }catch(Exception x){
                        sc.nextLine();
                        System.out.println("El indice se encuentra fuera de rango");
                    }
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
        System.out.println("5 - Listar Zonas de Escuadron");
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
    
    public static int menuSol(){
        System.out.println("1 - Infanteria Ligera");
        System.out.println("2 - Infanteria Pesada");
        System.out.println("3 - Sargento");
        System.out.println("4 - Capitan");
        System.out.println("5 - Super Soldado");
        boolean ingresada = false;
        int opcion = -1;
        while(!ingresada){
            try{
                opcion = sc.nextInt();
                ingresada = true;
            }
            catch(Exception x){
                sc.nextLine();
                System.out.println("Ingrese un valor numerico");
            }
        }
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
        sc.nextLine();
        String n = sc.nextLine();
        esc.add(new Escuadron(n));
    }
    
    public static void crearSoldado(ArrayList<Soldado> sol) throws Exception{
        int opcion = menuSol();
        System.out.println("Ingrese el nombre: ");
        sc.nextLine();
        String n = sc.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el rango: ");
        String ran = sc.next();
        System.out.println("Ingrese la vida del soldado: (100 - 400)");
        int hp = sc.nextInt();
        System.out.println("Ingrese el tiempo en el ejercito: (años)");
        int tiempo = sc.nextInt();
        switch(opcion){
            case 1:
                sol.add(new InfLigera(n, edad, ran, hp, tiempo));
                break;
            case 2:
                sol.add(new InfPesada(n, edad, ran, hp, tiempo));
                break;
            case 3:
                sol.add(new Sargento(n, edad, ran, hp, tiempo));
                break;
            case 4:
                sol.add(new Capitan(n, edad, ran, hp, tiempo));
                break; 
            case 5:
                sol.add(new SuperSoldado(n, edad, ran, tiempo));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        
    }
    
    public static void iniciar(ArrayList<Zonas> zonas, ArrayList<Escuadron> esc) throws Exception{
        
        Zonas z1 = new Zonas("Puente", 100, 0, 0);
        Zonas z2 = new Zonas("Bosque", 150, 100, 100);
        Zonas z3 = new Zonas("Ciudad", 200, 50, 50);
        zonas.add(z1);
        zonas.add(z2);
        zonas.add(z3);
        
        Escuadron rojo = new Escuadron("Rojo");
        Escuadron azul = new Escuadron("Azul");
        
        rojo.getSoldados().add(new InfLigera("Griggs", 28, "Sargento", 300, 5));
        rojo.getSoldados().add(new InfPesada("Evans", 25, "Coronel", 250, 4));
        rojo.getSoldados().add(new Sargento("Waters", 35, "Teniente", 350, 10));
        
        azul.getSoldados().add(new InfLigera("Soap", 28, "Sargento", 300, 5));
        azul.getSoldados().add(new InfPesada("Folewy", 25, "Coronel", 250, 4));
        azul.getSoldados().add(new Sargento("Woods", 35, "Teniente", 350, 10));
        
        rojo.getZonas().add(z1);
        azul.getZonas().add(z2);
        
        esc.add(rojo);
        esc.add(azul);
    }
    
    public static void peleas(Escuadron a, Escuadron b){
        if(a.getSoldados().size() >= 3 && b.getSoldados().size() >= 3){
            Zonas z = b.getZonas().get(0);
            boolean ingresado = false;
            boolean pelear = true;
            Soldado sol1 = null, sol2 = null;
            while(!ingresado){
                try{
                    System.out.println("Ingrese el indice del soldado atacante");
                    int s1 = sc.nextInt();
                    sol1 = a.getSoldados().get(s1);
                    System.out.println("Ingrese el indice del soldado defensor");
                    int s2 = sc.nextInt();
                    sol2 = b.getSoldados().get(s2);
                    ingresado = true;
                }catch(Exception x){
                    System.out.println("Datos Erroneos");
                }
            }
            while(pelear){
                double vida1 = sol1.getHp(), vida2 = sol2.getHp();
                int turno = 1;
                while(vida1 > 0 && vida2 > 0){
                    if(turno == 1){
                        vida2 -= sol1.atacar(sol2);
                        System.out.println(sol1.getNombre() + " ataco a " + sol2.getNombre());
                        System.out.println("vida de " + sol1.getNombre() + ": " + vida1);
                        System.out.println("vida de " + sol2.getNombre() + ": " + vida2);
                        turno = 2;
                    }
                    else if(turno == 2){
                        vida1 -= sol2.atacar(sol2);
                        System.out.println(sol1.getNombre() + " ataco a " + sol2.getNombre());
                        System.out.println("vida de " + sol1.getNombre() + ": " + vida1);
                        System.out.println("vida de " + sol2.getNombre() + ": " + vida2);
                        turno = 1;
                    }
                }
                if(vida1 == 0){
                        a.getSoldados().remove(sol1);
                        System.out.println("Dese seguir luchando:\n 0 - NO \n 1 - SI");
                        int opcion = sc.nextInt();
                        if(opcion == 0){
                            pelear = false;
                        }
                        else{
                            boolean ingresado2 = false; 
                            while(!ingresado2){
                                try{
                                    System.out.println("Ingrese el indice del soldado atacante");
                                    int s1 = sc.nextInt();
                                    sol1 = a.getSoldados().get(s1);
                                    ingresado2 = true;
                                }catch(Exception x){
                                    System.out.println("Datos Erroneos");
                                }
                            }
                        }
                    }
                    else{
                        b.getSoldados().remove(sol2);
                        System.out.println("Dese seguir luchando:\n 0 - NO \n 1 - SI");
                        int opcion = sc.nextInt();
                        if(opcion == 0){
                            pelear = false;
                            a.getZonas().add(z);
                            b.getZonas().remove(z);
                        }
                        else{
                            boolean ingresado2 = false; 
                            while(!ingresado2){
                                try{
                                    System.out.println("Ingrese el indice del soldado defensor");
                                    int s1 = sc.nextInt();
                                    sol1 = a.getSoldados().get(s1);
                                    ingresado2 = true;
                                }catch(Exception x){
                                    System.out.println("Datos Erroneos");
                                }
                            }
                        }
                    }
            }
        }else{
            System.out.println("No hay soldados suficientes para pelear");
        }
    }
}
