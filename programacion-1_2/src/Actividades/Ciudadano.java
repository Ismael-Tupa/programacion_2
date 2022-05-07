package Actividades;

public class Ciudadano extends Persona {
	private String provincia;
	private long dni;
	public Ciudadano(String pro, long d, String nom, String ape) {
		this.provincia = pro;
		this.dni = d;
		super.nombre = nom;
		super.apellido = ape;
	}
	public void setprovincia(String pro){
		this.provincia = pro;
	}
	public void setdni(long d){
		this.dni = d;
	}
	public String getprovincia(){
		return this.provincia;
	}
	public long getdni(){
		return this.dni;
	}

}
