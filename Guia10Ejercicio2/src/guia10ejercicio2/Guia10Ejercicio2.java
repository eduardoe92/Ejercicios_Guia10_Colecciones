
/**
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */

package guia10ejercicio2;

import Servicio.RazaService;
import java.util.Scanner;

public class Guia10Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        RazaService s1 = new RazaService();
                
        boolean menu = true;
        
        while (menu) {
            s1.crearMascota();
            System.out.println("¿Desea agregar otra mascota? S/N");
            String respuesta = leer.next().toLowerCase();
            if (!respuesta.equals("s")) {
                s1.mostrarMascota();
                menu = false;
            }
        }
        System.out.println("Ingrese el nombre de la mascota a remover de la lista");
        String eliminar = leer.next();
        //s1.eliminarMascota(eliminar);
        s1.mostrarIterator();
    }

}