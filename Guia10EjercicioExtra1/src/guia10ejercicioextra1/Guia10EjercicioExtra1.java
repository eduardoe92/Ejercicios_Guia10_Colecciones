
/**
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su media (promedio).
 */

package guia10ejercicioextra1;


import Servicio.NumericoService;
import java.util.ArrayList;

public class Guia10EjercicioExtra1 {

    public static void main(String[] args) {
       ArrayList <Integer> listaNum = new ArrayList();
       NumericoService serv = new NumericoService();
       serv.ingresarNumeros(listaNum);
       serv.calculos(listaNum);
       
    }

}