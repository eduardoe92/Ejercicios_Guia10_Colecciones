package servicio;

import entidades.Libroo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LibroService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libroo crearLibro() {
        System.out.println("Ingrese nombre del libro");
        String titulo = leer.next();
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de ejemplares");
        int ejemplares = leer.nextInt();
        System.out.println("Ingrese la cantidad de ejemplares prestados");
        int prestados = leer.nextInt();

        return new Libroo(titulo, autor, ejemplares, prestados);
    }

    public boolean prestamo(HashSet<Libroo> libreria) {
        System.out.println("Ingrese el titulo del libro que quiere prestar");
        String nombreABuscar = leer.next();
        boolean bandera = false;
        Iterator<Libroo> it = libreria.iterator();

        while (it.hasNext()) {
            Libroo next = it.next();

            if (next.getNombreLibro().equalsIgnoreCase(nombreABuscar)) {
                if (next.getEjemplares() > next.getPrestados()) {
                    next.setPrestados(next.getPrestados() + 1);
                    bandera = true;
                } else {
                    System.out.println("No quedan mas ejemplares");
                    bandera = false;
                }
            }
        }
        return bandera;
    }

    public boolean devolucion(HashSet<Libroo> libreria, String nombreABuscar) {
        boolean bande = false;
        Iterator<Libroo> it = libreria.iterator();

        while (it.hasNext()) {
            Libroo next = it.next();

            if (next.getNombreLibro().equalsIgnoreCase(nombreABuscar)) {
                if (next.getPrestados() > 0) {
                    next.setPrestados(next.getPrestados() - 1);
                    bande = true;
                } else {
                    System.out.println("El libro ingresado no figura prestado");
                    bande = false;
                }
                break;
            }
        }
        return bande;
    }
}
