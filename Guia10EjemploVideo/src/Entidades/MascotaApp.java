
package Entidades;

public class MascotaApp {
    
    private String nombre;
    private String apodo;
    private String raza;

    public MascotaApp() {
    }

    public MascotaApp(String nombre, String apodo, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "MascotaApp{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + '}';
    }

}
