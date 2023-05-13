package Servicios;

import Entidades.MascotaApp;
import java.util.Scanner;
import java.util.ArrayList;


public class MascotaAppService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<MascotaApp> mascotas;
    
    public MascotaAppService(){ //Nombre clase service
        this.mascotas = new ArrayList(); //variable mascotas del arrays
    }
    
    public MascotaApp crearMascota(){ 
        
        System.out.print("Introcucir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();
        
        MascotaApp m = new MascotaApp(nombre, apodo, tipo);
        
        mascotas.add(m);
        
        return m;
    }
    
    public void mostrarMascota(){
        
        System.out.println("Las mascotas actuales de la lista son: ");
        for (MascotaApp aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad de mascotas = " +mascotas.size());
    }
    
    /*Crear Mascotas, todos con los mismos nombres "Fer, Chiquito, Beagle"
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista 
     */
    
    public void fabricaChiquitos(int cantidad){
        
        //For Metodo 1
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new MascotaApp("Fer", "Chiquito", "Beagle"));
         }
//        For Metodo 2
//        for (int i = 0; i < cantidad; i++) {
//            MascotaApp aux = new MascotaApp("Fer", "Chiquito", "Beagle");          
//            mascotas.add(aux);
//         }
    }
    //Crear Mascotas pidiendo las variables por teclado
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            //Llamamos al metodo crearMascota
            MascotaApp mascotaCreada = crearMascota();
            
            System.out.println(mascotaCreada.toString());
        }
     }
}
        