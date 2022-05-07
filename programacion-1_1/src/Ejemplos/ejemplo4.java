package Ejemplos;

import java.util.Scanner;

public class ejemplo4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A,B,X;
		System.out.println("Este programa imprime los valores entre dos valores de forma creciente y excluye los multiplos que el usuario o desea");
		System.out.print("Ingrese un valor: ");
		A = entrada.nextInt();
		System.out.print("Ingrese un valor: ");
		B = entrada.nextInt();
		System.out.print("Ingrese el multiplo que desea que se excluya: ");
		X = entrada.nextInt();
		
		System.out.println("Resultado optenido");
		if(A<B){
			for(int i=A; i<=B; i++){
				if((i%X)!=0){
					System.out.println(i);
				}
			}
		}else{
			for(int i=B; i<=A; i++){
				if((i%X)!=0){
					System.out.println(i);
				}
			}
		}
	}

}
