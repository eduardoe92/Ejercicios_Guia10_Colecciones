package guia10ejemplovideo;

import Servicios.MascotaAppService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guia10EjemploVideo {

    public static void main(String[] args) {


          MascotaAppService servMasc = new MascotaAppService();
          String [] nombre = {"Pepe", "Pepa"};
          List<String> nombreList = new ArrayList(Arrays.asList(nombre));
          List<String> nombreList2 = new ArrayList();
          nombreList2.addAll(0, nombreList);
          
          //=============================================================================
          
          servMasc.fabricaMascota(2);
          servMasc.mostrarMascota();
          servMasc.actualizarMascota(0); //Cambiamos el primer (0) objeto de la lista
          servMasc.mostrarMascota();
          System.out.println("Eliminamos un objeto de la lista");
          servMasc.eliminarMascota(3); //Fallamos al eliminar un objeto ya que el indicie (3) no existe
          servMasc.mostrarMascota(); 

    }

}
