package ejercicios;

import java.util.Objects;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Grado grado = (Grado) o;
        return Objects.equals(nom, grado.nom)
            && Objects.equals(cantAlum, grado.cantAlum)
            && Objects.equals(nombre, grado.nombre)
            && Objects.equals(nivel, grado.nivel);
    }

}
