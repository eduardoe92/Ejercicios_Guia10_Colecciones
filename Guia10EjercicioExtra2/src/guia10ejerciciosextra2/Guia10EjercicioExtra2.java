/**
 * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá
 * como atributos el nombre y discoConMasVentas.
 * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de
 * tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante y su
 * disco con más ventas por pantalla.
 * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de agregar
 * un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario elija o
 * de salir del programa. Al final se deberá mostrar la lista con todos los cambios.
 */
package guia10ejerciciosextra2;

import Entidades.CantanteFamoso;
import Servicios.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10EjercicioExtra2 {

    public static void main(String[] args) {

        ArrayList<CantanteFamoso> artistas = new ArrayList();
        CantanteFamosoService serv = new CantanteFamosoService();

        artistas.add(new CantanteFamoso("Guns n Roses", "Appetite for Destruction"));
        artistas.add(new CantanteFamoso("Red Hot Chili Peppers", "Californication"));
        artistas.add(new CantanteFamoso("Coldplay", "Music of the Spheres"));
        artistas.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        artistas.add(new CantanteFamoso("Metallica", "Black Album"));
        menu(serv, artistas);

    }

    public static void showMenu() {
        System.out.println("========================");
        System.out.println("         MENU");
        System.out.println("========================");
        System.out.println("");
        System.out.println("1-Agregar un cantante mas");
        System.out.println("2-Mostrar lista de cantantes");
        System.out.println("3-Eliminar cantante");
        System.out.println("4-Salir");
        System.out.println("========================");
        System.out.println("");
        System.out.print("Ingrese un valor y luego presione la tecla enter: ");
    }

    public static void menu(CantanteFamosoService serv, ArrayList<CantanteFamoso> cantantes) {
        Scanner leer = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = leer.nextInt();

            switch (choice) {
                case 1:
                    serv.agregarCantante(cantantes);

                    break;
                case 2:
                    serv.mostrarCantantes(cantantes);
                    break;
                case 3:
                    serv.eliminarCantante(cantantes);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el programa!");
                    break;

                default:
                    System.out.println("Digito invalido");

            }
        } while (choice != 4);

    }
}
