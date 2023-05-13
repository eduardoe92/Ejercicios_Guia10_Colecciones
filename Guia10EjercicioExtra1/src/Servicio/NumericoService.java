package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

public class NumericoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarNumeros(ArrayList<Integer> num) {
        Integer numero;
        do {
            System.out.print("Ingrese un número: ");
            numero = leer.nextInt();
            if (numero != (-99)) {
                num.add(numero);
            }
        } while (numero != -99);
    }

    public void calculos(ArrayList<Integer> num) {
        System.out.println(num.toString());
        int suma = 0;
        for (int i = 0; i < num.size(); i++) {
            suma += num.get(i);
        }
        System.out.println("La suma de los valores de la lista es: " + suma);
        System.out.println("El promedio de los valores es: " + suma / num.size());
    }
}
