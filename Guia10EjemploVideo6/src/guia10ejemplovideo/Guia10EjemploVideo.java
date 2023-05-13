package guia10ejemplovideo;

import Entidades.MascotaApp;
import java.util.ArrayList;
import java.util.Collections;
import Utilidades.Comparadores;

public class Guia10EjemploVideo {

    public static void main(String[] args) {

        ArrayList<MascotaApp> mascotas = new ArrayList();
        
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

        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        Collections.shuffle(mascotas);
        
        for (MascotaApp mascota : mascotas) {
            System.out.println(mascota);
        }
    }

}
