
package Entidades;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombre);
        hash = 19 * hash + Objects.hashCode(this.apodo);
        hash = 19 * hash + Objects.hashCode(this.raza);
        hash = 19 * hash + Objects.hashCode(this.edad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MascotaApp other = (MascotaApp) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "MascotaApp{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", edad=" + edad + '}';
    }

}
