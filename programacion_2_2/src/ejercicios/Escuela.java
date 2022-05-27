package ejercicios;
import java.util.Objects;

public class Escuela {
	protected String nombre, nivel; 
	
	public Escuela(String nom, String ni) {
		this.nombre = nom;
		this.nivel = ni;
	}
	
	public void setnombre(String nom) {
		this.nombre = nom;
	}
	
	public void setnivel(String niv) {
		this.nivel = niv;
	}
	
	public String getnombre() {
		return this.nombre;
	}
	public String getnivel() {
		return this.nivel;
	}
	
	    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Escuela escuela = (Escuela) o;
        return Objects.equals(nombre, escuela.nombre)
            && Objects.equals(nivel, escuela.nivel);
    }
	    
	public String toString() {
		return "[ Nombre:"+this.nombre+" | Nivel:"+this.nivel+" ]";
	}
}
