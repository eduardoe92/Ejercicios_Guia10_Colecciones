
package Utilidades;

import Entidades.MascotaApp;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<MascotaApp> ordenarPorNombreDesc = new Comparator<MascotaApp>() {
        @Override
        public int compare(MascotaApp o1, MascotaApp o2) {
        
            return o2.getNombre().compareTo(o1.getNombre());
        }
    };
    public static Comparator<MascotaApp> ordenarPorEdadDesc = new Comparator<MascotaApp>() {
        @Override
        public int compare(MascotaApp o1, MascotaApp o2) {
        
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };
}
