package guia10ejemplovideo;

import Entidades.MascotaApp;
import java.util.HashSet;
import java.util.Set;

public class Guia10EjemploVideo {

    public static void main(String[] args) {
        
        Set<MascotaApp> mascotas = new HashSet();
        
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        
//        for (String nombre : nombres) {
//            System.out.println(nombre); //Los conjuntos solo soportan un elemento, no dublicado
//                                                             //Lo mismo pasa si fuera un TreeSet
//        }
//
//        ArrayList<MascotaApp> mascotas = new ArrayList();
        
        mascotas.add(new MascotaApp ("Fer", "Chiquito", "Perro"));
        mascotas.add(new MascotaApp ("Fer", "Chiquito", "Perro"));
        mascotas.add(new MascotaApp ("Fer", "Chiquito", "Perro"));
        mascotas.add(new MascotaApp ("Fer", "Chiquito", "Perro"));
        mascotas.add(new MascotaApp ("Fer", "Chiquito", "Perro"));
        mascotas.add(new MascotaApp ("Fer", "Chiquito", "Perro"));
        mascotas.add(new MascotaApp("Pepa", "Lola", "Gato"));
        mascotas.add(new MascotaApp("Pepa", "Lola", "Gato"));
        mascotas.add(new MascotaApp("Pepa", "Lola", "Gato"));
        mascotas.add(new MascotaApp("Pepa", "Lola", "Gato"));
        mascotas.add(new MascotaApp("Pepa", "Lola", "Gato"));
        mascotas.add(new MascotaApp("Pepa", "Lola", "Gato"));
        
        for (MascotaApp mascota : mascotas) {
            System.out.println(mascota);
        }
    }

}
