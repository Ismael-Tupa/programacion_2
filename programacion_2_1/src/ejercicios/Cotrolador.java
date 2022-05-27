package ejercicios;

public class Cotrolador {
	public static void main (String args[]) {
		
		Grado cosa = new Grado ("alicia", "segudaria", "Quito", 33);
		System.out.println(cosa.toString());
		Escuela cosa1 = (Escuela) cosa;
		System.out.println(cosa1.toString());
		
		Escuela cosa3 = new Escuela("Uncuyo", "Universitario");
		System.out.println(cosa3.toString());
		Grado cosa2 = (Grado) cosa3;
		System.out.println(cosa2.toString());
		
	}
}
