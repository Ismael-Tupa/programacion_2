package Ejemplos;
import java.util.Scanner;
public class ejemplo1{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A,B;
		System.out.println("Este programa imprime los valores entre dos valores");
		System.out.print("Ingrese un valor menor al siguiente: ");
		A = entrada.nextInt();
		System.out.print("Ingrese un valor mayor al anterior: ");
		B = entrada.nextInt();
		System.out.println("Resultado optenido");
		for(int i=A; i<=B; i++){
			System.out.println(i);
		}
	}
}
