package ejercicios;

public class Grado extends Escuela{
	private String nom;
	private int cantAlum;
	
	public Grado(String nombre, String nivel, String nom, int cantAlum) {
		super(nombre,nivel);
		this.nom = nom;
		this.cantAlum = cantAlum;
	}
	
	public void setnom(String nom) {
		this.nom = nom;
	}
	
	public void setcantAlum(int ct) {
		this.cantAlum = ct;
	}
	
	public String getnom() {
		return this.nom;
	}
	
	public int getcantAlum() {
		return this.cantAlum;
	}
	@Override
	public String toString() {
		return "[ Escuela: "+this.nombre+" | Nivel:"+this.nivel+" | Grado:"+this.nom+" | Cant_Alumnos:"+this.cantAlum+" ]";
	}

}
