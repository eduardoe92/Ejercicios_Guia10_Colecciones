
package Servicio;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Scanner;

public class RazaService {
    
    Raza raza = new Raza();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <String> mascotas = new ArrayList();
    
    public void crearMascota(){
        
            System.out.print("Introduce el nombre de su mascota: ");
            String nombre = leer.next();
            System.out.print("Introduce la raza de la mascota: ");
            String raza = leer.next();
            System.out.print("Introduce la edad de la mascota: ");
            int edad = leer.nextInt();
            mascotas.add(" Nombre: "+nombre+"\n Raza: "+raza+"\n Edad: "+edad);            
    }
    public void mostrarMascota(){
            System.out.println("Las mascotas son: ");
        for (String aux : mascotas) {
            System.out.println(aux+ "\n");
        }
    }
    
}
