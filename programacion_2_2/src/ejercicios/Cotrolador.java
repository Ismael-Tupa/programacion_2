package ejercicios;

public class Cotrolador {
	public static void main (String args[]) {
		
		Grado cosa = new Grado ("alicia", "segudaria", "Quito", 33);
		Grado cosa1 = new Grado("solaris", "segudaria", "Cuarto", 23);
		System.out.println(cosa.toString());
		System.out.println(cosa1.toString());
		System.out.println(cosa1.equals(cosa));
		
		Escuela cosa3 = new Escuela("Uncuyo", "Uiversitario");
		Escuela cosa4 = new Escuela("Uncuyo", "Uiversitario");
		System.out.println(cosa3.toString());
		System.out.println(cosa4.toString());
		System.out.println(cosa3.equals(cosa4));

	}
}
