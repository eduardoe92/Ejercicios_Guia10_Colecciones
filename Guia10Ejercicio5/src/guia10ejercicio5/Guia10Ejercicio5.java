
/**
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */

package guia10ejercicio5;

import Servicios.PaisServicio;
import java.util.Scanner;

public class Guia10Ejercicio5 {

    public static void main(String[] args) {
        
        PaisServicio pais = new PaisServicio();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        pais.ingresarPais();
        System.out.print("Desea Ordenar Alfabeticamente? (S/N) ");
        String resp = sc.next().toUpperCase();
        if ("S".equals(resp)) {
            pais.OrdenarPais();
        }
        
        System.out.print("¿Desea eliminar un país? (S/N) ");
        String resp2 = sc.next().toUpperCase();
        if ("S".equals(resp2)) {
            System.out.print("¿Ingrese el nombre del pais a eliminar: ");
            String nomP = sc.next();
            pais.EliminarPais(nomP);
        }
    }
    
}