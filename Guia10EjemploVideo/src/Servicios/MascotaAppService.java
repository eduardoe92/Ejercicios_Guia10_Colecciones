package Servicios;

import java.util.Scanner;
import java.util.ArrayList;


public class MascotaAppService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> mascotas;
    
    public MascotaAppService(){
        this.mascotas = new ArrayList();
    }
    
    public void crearMascota(){
        
        System.out.print("Introcucir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();
        
        String mascota = nombre+ " " +apodo+ " " +tipo; //genero variable mascota dentro del metodo
        
        mascotas.add(mascota); //guardo los datos en el array
    }
    
    public void mostrarMascota(){
        
        System.out.println("Las mascotas actuales de la lista son: ");
        for (String aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad de mascotas = " +mascotas.size());
    }
    
}