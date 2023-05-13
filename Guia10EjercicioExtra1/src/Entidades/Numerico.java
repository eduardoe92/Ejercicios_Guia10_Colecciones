
package Entidades;

public class Numerico {
    
    private Integer numeros;

    public Numerico() {
    }

    public Numerico(Integer numeros) {
        this.numeros = numeros;
    }

    public Integer getNumeros() {
        return numeros;
    }

    public void setNumeros(Integer numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numerico{" + "numeros=" + numeros + '}';
    }
    
}
