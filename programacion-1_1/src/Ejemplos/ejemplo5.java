package Ejemplos;

import java.util.Scanner;

public class ejemplo5 {
	
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
				if(X <= (B-A)){
					for(int i=A; i<=B; i++){
						if((i%X)!=0){
							System.out.println(i);
						}
					}
				}else {
					System.out.print("ERROR!! el tercer valor ingresado es mayor a la diferencia entre los dos primeros valores ingresados");
				}
			}else{
				if(X <= (A-B)){
					for(int i=B; i<=A; i++){
						if((i%X)!=0){
							System.out.println(i);
						}
					}
				}else {
					System.out.print("ERROR!! el tercer valor ingresado es mayor a la diferencia entre los dos primeros valores ingresados");
				}
			}	
		
	}
}
