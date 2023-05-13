package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarCantante(ArrayList<CantanteFamoso> cantantes) {
        
        String opc;
        do {
            System.out.print("Ingrese el nombre del cantante: ");
            String nombre = leer.next();
            System.out.print("Ingresa el disco más vendido: ");
            String disco = leer.next();
            cantantes.add(new CantanteFamoso(nombre, disco));
            System.out.print("¿Desea seguir agregando más cantantes? (S/N) ");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("N"));
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantes){
        System.out.println(cantantes.toString());
    }

    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes){
        System.out.println("Ingrese el nombre del cantante que desea eliminar de la lista");
        String nombre=leer.next();
        Iterator<CantanteFamoso> it = cantantes.iterator();
        while (it.hasNext()) {
            CantanteFamoso next = it.next();
            if (next.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                break;
            }else if(!it.hasNext()){
                System.out.println("El cantante ingresado no está en la lista");
            }  
        }
    }
}
