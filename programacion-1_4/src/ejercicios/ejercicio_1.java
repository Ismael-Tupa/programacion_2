package ejercicios;
import java.util.Scanner;
public class ejercicio_1 {

	public static void main(String[] args) {

		try (Scanner dato = new Scanner(System.in)) {
			int info = 0;	
			
			System.out.println("Ingrese la dimencion del vector");
			info = dato.nextInt();
			
			int numeros[] = new int[info];
			
			for(int i=0; i<numeros.length; i++){
				System.out.println("Ingrese el valor #" + (i+1));
				numeros[i]= dato.nextInt();
			}
			System.out.println("Los valores del vector son:");
			for(int i=0; i<numeros.length; i++){
				System.out.print("["+numeros[i]+"]");
			}
		}
	}
	
}
