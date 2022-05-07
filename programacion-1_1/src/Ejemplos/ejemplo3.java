package Ejemplos;

import java.util.Scanner;

public class ejemplo3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A,B;
		System.out.println("Este programa imprime los valores entre dos valores de forma creciente y excluye los valores que son multiplos del 5");
		System.out.print("Ingrese un valor: ");
		A = entrada.nextInt();
		System.out.print("Ingrese un valor: ");
		B = entrada.nextInt();
		
		System.out.println("Resultado optenido");
		if(A<B){
			for(int i=A; i<=B; i++){
				if((i%5)!=0){
					System.out.println(i);
				}
			}
		}else{
			for(int i=B; i<=A; i++){
				if((i%5)!=0){
					System.out.println(i);
				}
			}
		}

	}
}
