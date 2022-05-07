package actividad;
import java.util.Scanner;
public class Vista {
	public static void mostrarCiudadano(Ciudadano p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
		System.out.println(p.getprovincia());
		System.out.println(p.getdni());
	}
	
	public static Ciudadano entregarCiudadano(){
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("ingrese un nombre");
			String nom = scanner.next();
			System.out.println("ingrese un apellido");
			String ape = scanner.next();
			System.out.println("ingrese la provincia");
			String por = scanner.next();
			System.out.println("ingrese el DNI");
			Long dni = scanner.nextLong();
			
			Ciudadano nnPersona = new Ciudadano(por, dni, nom, ape);
			return nnPersona;
		}
	}

}
