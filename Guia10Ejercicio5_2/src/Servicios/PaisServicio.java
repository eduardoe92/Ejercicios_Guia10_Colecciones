package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {

    HashSet<String> Pais = new HashSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarPais() {
        String op;
        do {
            System.out.print("Ingrese un pais: ");
            Pais.add(leer.next());

            System.out.print("¿Desea agregar otro pais? (S/N) ");
            op = leer.next();

        } while (op.equalsIgnoreCase("S"));

        System.out.println(Pais);

        System.out.println("-----------------------");

    }

    public void ordenarPais() {
        ArrayList<String> lista = new ArrayList(Pais);
        Collections.sort(lista);
        System.out.println("Lista de países en orden alfábetico");
        System.out.println(lista);
    }

    public void eliminarPais() {
    boolean encontrado = false;
    System.out.print("¿Desea eliminar un país? (S/N) ");
    String eleccion = leer.next();
    if (eleccion.equalsIgnoreCase("S")) {
        System.out.print("¿Qué país desea eliminar? ");
        String respuesta = leer.next();
        Iterator<String> it = Pais.iterator();
        while (it.hasNext()) {
            if (it.next().equals(respuesta)) {
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Se ha eliminado el país");
            ordenarPais();
        } else {
            System.out.println("No se ha encontrado el país");
        }
    } else if (eleccion.equalsIgnoreCase("N")) {
        System.out.println("Sesión finalizada");
    } else {
        System.out.println("Caracter ingresado inválido");
    }
    }
}
