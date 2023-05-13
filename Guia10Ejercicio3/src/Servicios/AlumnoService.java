package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    private Scanner leer = new Scanner(System.in);
    private ArrayList<Alumno> alumnos = new ArrayList();

    public void cargarAlumno() {
        boolean salir = false;

        do {
            ArrayList<Double> notasAux = new ArrayList();
            System.out.println("Ingrese los datos del alumno: ");
            System.out.print("Nombre: ");
            String nombre = leer.next();
            System.out.println("Ingrese las notas");
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                notasAux.add(leer.nextDouble());
            }
            alumnos.add(new Alumno(nombre, notasAux));
            System.out.println("¿Desea cargar más datos? S/N");
            String resp = leer.next().toUpperCase();
            if (resp.equalsIgnoreCase("N")) {
                salir = true;
            }
        } while (!salir);
    }

    public double notaFinal() {
        System.out.print("Ingrese el nombre del alumno para saber su nota final: ");
        String nombre = leer.next();
        Iterator<Alumno> it = alumnos.iterator();
        double suma = 0;
        int contador = 0;
        while (it.hasNext()) {
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                for (double nota : alumno.getNotas()) {
                    suma += nota;
                    contador++;
                }
            }
        }
        return suma / contador;
    }

    @Override
    public String toString() {
        return alumnos.toString();
    }
}
