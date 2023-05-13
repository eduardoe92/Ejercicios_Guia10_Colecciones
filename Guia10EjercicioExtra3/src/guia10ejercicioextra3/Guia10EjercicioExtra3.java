/*
3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package guia10ejercicioextra3;

import entidades.Libroo;
import java.util.HashSet;
import java.util.Scanner;
import servicio.LibroService;

public class Guia10EjercicioExtra3 {

    public static void main(String[] args) {
        HashSet<Libroo> biblioteca = new HashSet();
        LibroService serv = new LibroService();
        String opc;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Desea ingresar libros a la biblioteca? si/no");
        opc = leer.next();
        if (opc.equalsIgnoreCase("si")) {
            do {
                biblioteca.add(serv.crearLibro());
                System.out.println("Quiere seguir ingresando libros?si/no");
                opc = leer.next();
            } while (!opc.equalsIgnoreCase("no"));
        } else {
            System.out.println("elegiste la opcion de no ingresar nada");
        }

        System.out.println(biblioteca.toString());
        serv.prestamo(biblioteca);
        boolean prestamoExitoso = serv.prestamo(biblioteca);
        if (prestamoExitoso) {
            System.out.println("Préstamo realizado con éxito");
        } else {
            System.out.println("No se pudo realizar el préstamo");
        }

        System.out.println(biblioteca.toString());
        System.out.println("Ingrese el nombre del libro a devolver:");
        String nombreLibroDevolver = leer.next();
        serv.devolucion(biblioteca, nombreLibroDevolver);

        System.out.println(biblioteca.toString());
    }
}
