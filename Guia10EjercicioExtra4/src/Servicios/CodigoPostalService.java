package Servicios;

import Entidades.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigoPostalService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CodigoPostal codigo = new CodigoPostal();

    public void llenarCiudades(HashMap<Integer, String> lista) {
        lista.put(1801, "ezeiza");
        lista.put(1888, "florencio varela");
        lista.put(1870, "avellaneda");
        lista.put(1880, "berazategui");
        lista.put(1878, "quilmes");
        lista.put(8000, "bahia blanca");
        lista.put(7223, "general belgrano");
        lista.put(1981, "Kilometro 70 ");
        lista.put(6500, "9 de julio");
        lista.put(2804, "campana");
    }

    public void agregarCiudad(HashMap<Integer, String> lista) {
        System.out.print("Ingrese por favor el nombre de la Ciudad: ");
        String ciudad = leer.next();
        System.out.print("Ingrese por favor el número del código postal de la ciudad: ");
        int cp = leer.nextInt();
        lista.put(cp, ciudad);
    }

    public void mostrarDatos(HashMap<Integer, String> lista) {
        for (Map.Entry<Integer, String> entry : lista.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Ciudad: " + value + "\nCódigo Postal: " + key + "\n");
        }
    }

    public void buscarCiudad(HashMap<Integer, String> lista) {
        System.out.print("Introduzca el código postal de la ciudad a buscar: ");
        int codi = leer.nextInt();
        boolean encontrado = false;
        for (Map.Entry<Integer, String> entry : lista.entrySet()) {
            if (codi == entry.getKey()) {
                System.out.println("La ciudad correspondiente al código postal es: " + entry.getValue());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El código postal ingresado no existe en la base de datos.");
        }
    }

    public void eliminarCiudadPorNombre(HashMap<Integer, String> lista) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre de la ciudad que desea eliminar de la lista: ");
            String ciudad = leer.next().toLowerCase();
            if (lista.containsValue(ciudad)) {
                for (Map.Entry<Integer, String> entry : lista.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(ciudad)) {
                        lista.remove(entry.getKey());
                        System.out.println("La ciudad " + ciudad + " fue eliminada con éxito!!!\n");
                        break;
                    }
                }
            } else {
                System.out.println("La ciudad ingresada no se encuentra en la lista.\n");
            }
        }
    }

    public void eliminarCiudadPorCodigo(HashMap<Integer, String> lista) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduzca un código postal a eliminar: ");
            int cp = leer.nextInt();
            if (lista.containsKey(cp)) {
                lista.remove(cp);
            } else {
                System.out.println("Código Postal no encontrado");
            }
        }
    }

    public void showMenu() {
        System.out.println("========================");
        System.out.println("         MENU");
        System.out.println("========================");
        System.out.println("");
        System.out.println("1- Llenar lista con las ciudades");
        System.out.println("2- Buscar ciudad");
        System.out.println("3- Eliminar 3 ciudades por nombre");
        System.out.println("4- Eliminar 3 ciudades por código postal");
        System.out.println("5- Agregar ciudad a la lista");
        System.out.println("6- Mostrar datos");
        System.out.println("71- Salir");
        System.out.println("========================");
        System.out.println("");
        System.out.println("Ingrese un valor y luego presione la tecla enter.");
    }

    public void menu(HashMap<Integer, String> lista) {
        int choice;
        do {
            showMenu();
            choice = leer.nextInt();

            switch (choice) {
                case 1:
                    llenarCiudades(lista);
                    break;
                case 2:
                    buscarCiudad(lista);
                    break;
                case 3:
                    eliminarCiudadPorNombre(lista);
                    break;
                case 4:
                    eliminarCiudadPorCodigo(lista);
                    break;
                case 5:
                    agregarCiudad(lista);
                    break;
                case 6:
                    mostrarDatos(lista);
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el programa!");
                    break;
                default:
                    System.out.println("Dígito invalido");
            }
        } while (choice != 7);
    }
}
