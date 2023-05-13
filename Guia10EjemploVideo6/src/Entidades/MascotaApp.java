
package Entidades;

public class MascotaApp {
    
    private String nombre;
    private String apodo;
    private String raza;
    private Integer edad;

    public MascotaApp() {
    }

    public MascotaApp(String nombre, String apodo, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
    }
    

    public MascotaApp(String nombre, String apodo, String raza, Integer edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.edad = edad;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MascotaApp{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", edad=" + edad + '}';
    }

        

}
