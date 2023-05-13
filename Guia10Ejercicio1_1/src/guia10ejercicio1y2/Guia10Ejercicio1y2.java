/**
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
 El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 después se le preguntará al usuario si quiere guardar otro perro o si quiere salir.
 Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */

package guia10ejercicio1y2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Guia10Ejercicio1y2 {

    public static void main(String[] args) {
        
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Ingrese la raza del perro: ");
            razas.add(leer.nextLine().toUpperCase());
            System.out.println("Desea agregar otra raza? S/N");
            resp= leer.nextLine().toUpperCase();
            if (!(resp.equals("S"))&&!(resp.equals("N"))) {
            System.out.println("La opción ingresada es incorrecta, intente nuevamente: ");
            resp=leer.nextLine().toUpperCase();
            }
            } while (resp.equalsIgnoreCase("S"));
        
        System.out.println(razas.toString());
        
        String raza;
        System.out.println("Ingrese la raza que desea eliminar: ");
        raza=leer.nextLine().toUpperCase();
        boolean encontrada = false;
        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                encontrada=true;
            
            if (encontrada) {
                System.out.println("Raza eliminada exitosamente");
                System.out.println(razas.toString());
            }else{
                System.out.println("La raza no se encuentra en la lista");
            }
           }
        }
    }   
}