
package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TiendaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public final HashMap<String, Double> hm = new HashMap();
    
    public void introducirElemento(){
        System.out.println("Introduzca el nombre del Producto");
        String nom = leer.next();
        System.out.println("Ahora el precio por favor");
        double precio = leer.nextDouble();
        hm.put(nom, precio);
    }
    
    public void modificarPrecio(){
        System.out.println("Introduzca el nombre del producto al cual modificarle el precio");
        String busqueda = leer.next();
        System.out.println("Introduzca el valor nuevo del producto");
        double precio = leer.nextDouble();
        hm.put(busqueda, precio);
    }
    
    public void eliminarProducto(){
        System.out.println("Introduzca un producto a borrar");
        String busqueda = leer.next();
        if (hm.containsKey(busqueda)) {
            hm.remove(busqueda);    
            System.out.println("Producto eliminado");
        }else{
            System.out.println("El producto no existe");
        }
        
        
        
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Double> aux : hm.entrySet()) {
            System.out.println("Nombre: " + aux.getKey() + "\nPrecio: " + aux.getValue());
        }
    }
    
    public void menu(){
        boolean salir = false;
        
        while (!salir) {
        System.out.println("Bienvenido!");
        System.out.println("\t° 1 - Introducir Producto");
        System.out.println("\t° 2 - Modificar Precio");
        System.out.println("\t° 3 - Eliminar Producto");
        System.out.println("\t° 4 - Mostrar Productos");
        System.out.println("\t° 5 - Salir");
            
        int choice = leer.nextInt();
        
            switch (choice) {
                case 1:
                    introducirElemento();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta Luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción Inválida");;
            }
        }
    }
}
