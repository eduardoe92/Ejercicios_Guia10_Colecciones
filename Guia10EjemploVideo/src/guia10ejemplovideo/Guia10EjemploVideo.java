package guia10ejemplovideo;

import java.util.ArrayList;

public class Guia10EjemploVideo {

    public static void main(String[] args) {

        //Arrays
        String[] nombreArray = new String[5];
 
        for (int i = 0; i < nombreArray.length; i++) {
            nombreArray[i] = "Chiquito " +(i+1);
        }
        for (String var : nombreArray) {
            System.out.println(var);
        }
        
        //COLLECTION
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Mediano");
        nombresArrayList.add("Gigante");
        
        System.out.println(nombresArrayList.size()); //Arrays dimensión [3]
        
        nombresArrayList.remove("Chiquito"); //Eliminamos una dimensión
        
        System.out.println(nombresArrayList.size()); //Arrays dimensión [2]
        
        System.out.println(Integer.MAX_VALUE); //Máximo valor de Integer = 2.147.483.647 

    }

}
