package ejercicios;

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
	
	public String toString() {
		return "[ Nombre:"+this.nombre+" | Nivel:"+this.nivel+" ]";
	}
}
