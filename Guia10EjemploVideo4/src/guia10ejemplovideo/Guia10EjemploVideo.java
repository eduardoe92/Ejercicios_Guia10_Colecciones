package guia10ejemplovideo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Guia10EjemploVideo {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList(); //Bueno solo para mostrar un array
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Chiquito");
        
        
        //Parte a)
        System.out.println("Lista completa de nombres");//Mostramos la lista
            for (String aux : nombres) {
                System.out.println(aux);
        }

            System.out.println("");
            System.out.println("Eliminamos un nombre");
            for (int i = 0; i < nombres.size(); i++) {
            String m = nombres.get(i);
                if (m.equals("Lola")) {
                    nombres.remove(m);
                    
                }
        }
            nombres.forEach((e) -> System.out.println(e)); //Mostramos la nueva lista
            
            //parte b) ITERATOR
            
            //El iterator me desarma la lista y me deja recorrerla mejor 
            
            Iterator<String> it = nombres.iterator();
            
            System.out.println("Lista Completa");
            while (it.hasNext()) { //evalua(0) y luego salta al siguiente (1) siempre que exista, hasta cortar bucle
            String aux = it.next(); //toma un objeto
                if (aux.equals("Lola")) {
                    it.remove();
                }
                
                System.out.println(aux);
                
        }
            System.out.println("");
            System.out.println("Lista Actualizada luego del Iterator, eliminamos a Lola");
            nombres.forEach((e) -> System.out.println(e)); //Mostramos la nueva lista
        
    }

}
