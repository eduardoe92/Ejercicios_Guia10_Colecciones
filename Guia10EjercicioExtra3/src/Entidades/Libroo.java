
package entidades;

public class Libroo {
    private String nombreLibro;
    private String autor;
    private Integer ejemplares;
    private Integer prestados;

    public Libroo() {
    }

    public Libroo(String nombreLibro, String autor, Integer ejemplares, Integer prestados) {
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "libro{" + "nombreLibro=" + nombreLibro + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
}
