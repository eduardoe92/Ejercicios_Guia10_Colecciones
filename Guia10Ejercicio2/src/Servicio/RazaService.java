package Servicio;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService {

    Raza raza = new Raza();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<String> mascotas = new ArrayList();
    Iterator<String> iter = mascotas.iterator();

    public void crearMascota() {

        System.out.print("Introduce el nombre de su mascota: ");
        String nombre = leer.next();
//        System.out.print("Introduce la raza de la mascota: ");
//        String raza = leer.next();
//        System.out.print("Introduce la edad de la mascota: ");
//        int edad = leer.nextInt();
//        mascotas.add(" Nombre: " + nombre + "\n Raza: " + raza + "\n Edad: " + edad);
          mascotas.add(" Nombre: "+ nombre);
    }

    public void mostrarMascota() {
        System.out.println("Las mascotas son: ");
        for (String aux : mascotas) {
            System.out.println(aux + "\n");
        }
    }
    
    public void eliminarMascota(String e1) {
        System.out.println(e1);
        
        for (String aux : mascotas) {
            if (e1.equals(aux)) {
                System.out.println("La mascota ha sido eliminada");
                mascotas.remove(e1);
            }
        }
        mostrarMascota();        
    }
    public void mostrarIterator(){
        System.out.println("Los valores iterator son: ");
        while (iter.hasNext()) {
            System.out.println(iter.next().toString() + " ");            
        }
    }
    
}


