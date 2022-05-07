package actividad;

public class Controlador {
	public static void main(String args[]) {
		
		Ciudadano esaPersona = Vista.entregarCiudadano();
		//System.out.println(esaPersona);
		Vista.mostrarCiudadano(esaPersona);
	}
}
