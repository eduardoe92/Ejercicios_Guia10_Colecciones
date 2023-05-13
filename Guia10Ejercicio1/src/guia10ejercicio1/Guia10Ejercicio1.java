/**
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
 El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
 Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */

package guia10ejercicio1;

import java.util.Scanner;
import Servicio.RazaService;
public class Guia10Ejercicio1 {

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
                System.out.println("Hasta luego");
                menu = false;
            }
        }
        
    }

}