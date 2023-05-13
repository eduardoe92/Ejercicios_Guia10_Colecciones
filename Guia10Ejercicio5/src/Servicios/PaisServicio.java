
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PaisServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<String> pais = new HashSet<>();
    
    public void ingresarPais(){
        
        boolean salir = false;
        System.out.println("--------CARGA DE DATOS--------");
        
        while(!salir){
            System.out.print("Ingrese un País: ");
            String paisIn = leer.next();

            pais.add(paisIn);
            System.out.print("Desea cargar otro País? (S/N) ");
            String resp = leer.next().toUpperCase();
            if ("N".equals(resp)) {
                salir = true;
            }
        }
        MostrarAll();
    }
    
    public void MostrarAll(){
        pais.forEach((pa) -> {
            System.out.println(pa);
        });       
    }
    
    public void OrdenarPais(){
        ArrayList<String> ListPais = new ArrayList(pais);
        Collections.sort(ListPais);
        ListPais.forEach((pa) -> {
            System.out.println(pa);
        });
    }
    
    public void EliminarPais(String np){
        Iterator<String> it = pais.iterator();
        while (it.hasNext()) {
            if(it.next().equals(np)){
                it.remove();
            }
        }
        MostrarAll();
    }
}
