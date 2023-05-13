package guia10ejemplovideo;

import Servicios.MascotaAppService;

public class Guia10EjemploVideo {

    public static void main(String[] args) {

        
        MascotaAppService servMasc = new MascotaAppService();
        
        servMasc.crearMascota(); //Mascota 1
        servMasc.crearMascota(); //Mascota 2
        
        servMasc.mostrarMascota(); 
        
        servMasc.fabricaChiquitos(140); //Creamos 140 Chiquitos automaticamente
        servMasc.fabricaMascota(2); //Creamos 2 mascotas, y nos va mostrando cada mascota creada al momento
        servMasc.mostrarMascota();

    }

}
