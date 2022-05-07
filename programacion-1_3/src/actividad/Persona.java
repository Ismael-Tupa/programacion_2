package actividad;

public class Persona {
	protected String nombre, apellido;
	
	public void setNombre(String nom){
		this.nombre = nom;
	}
	public void setApellido(String ape){
		this.apellido = ape;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getApellido(){
		return this.apellido;
	}
}
