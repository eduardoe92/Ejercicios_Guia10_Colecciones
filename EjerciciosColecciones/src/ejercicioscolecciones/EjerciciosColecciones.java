/**
 * Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package ejercicioscolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class EjerciciosColecciones {

    public static void main(String[] args) {

        ArrayList<Integer> numeroA = new ArrayList();
        Scanner leer = new Scanner(System.in);
//        int x = 20;
//        int s = 3;
//        int zz = 8 / 4;

//        for (int i = 0; i < 10; i++) {
//            numeroA.add(i+1);
//        }
//        numeroA.remove(0);
//        numeroA.remove(0);
//        numeroA.add(0,51);
//        numeroA.add(4,23);
//        System.out.println(numeroA);
        

//        for (int i = 0; i < 10; i++) {
//            numeroA.add(leer.nextInt());
//        }
//        System.out.println(numeroA.contains(5)); //contains es booleano, para verificar si existe el "5" en el vector
//        System.out.println(numeroA);
//
//        HashSet<Integer> numeroB = new HashSet();
//        numeroB.add(Integer.SIZE);
//        numeroB.add(1);
//        System.out.println(numeroB);
//
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 12345678;
        String nombre = "Pepe";

        alumnos.put(dni, nombre);
        System.out.println("Objeto lleno: "+alumnos);
        alumnos.remove(dni); //Borramos el DNI
        System.out.println("Objeto vacío: " +alumnos); //Objeto Vacío

        
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println(value +" "+key);
            System.out.println(value);
        }

//        alumnos.entrySet().stream().map((entry) -> {
//         Integer key = entry.getKey();
//             System.out.println(key);
//            return entry;
//        }).map((entry) -> entry.getValue()).forEachOrdered((value) -> {
//             
//            System.out.println(value);
//        });

         alumnos.entrySet().forEach((entry) -> {
            Integer clave = entry.getKey();
            String valor = entry.getValue();
            System.out.println(valor + " " + clave);
        });
            
         
         
    }

}
