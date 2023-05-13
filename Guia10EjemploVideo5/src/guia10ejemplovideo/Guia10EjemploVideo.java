package guia10ejemplovideo;

import Servicios.MascotaAppService;

public class Guia10EjemploVideo {

    public static void main(String[] args) {

         MascotaAppService servMasc = new MascotaAppService();
         
          servMasc.fabricaMascota(1); //Creamos la Mascota con nombre Lola
          servMasc.eliminarMascotaPorNombre("Lola"); //Elimimanos la mascota Lola
          servMasc.mostrarMascota(); //Mostramos la lista

    }

}
