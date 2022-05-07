package ejercicios;

import java.util.Scanner;
import java.util.Random;
public class ejercicio_3 {

	public static void main(String[] args) {
		Random aleatorio = new Random(System.currentTimeMillis());
		try (Scanner dato=new Scanner(System.in)){int info = 0;	
		
		System.out.println("Ingrese la dimencion del vector");
		info = dato.nextInt();
		
		int numeros[] = new int[info];
		
		for(int i=0; i<numeros.length; i++){
			int a = aleatorio.nextInt(100);
			if(a%7 == 0){
				i = i - 1;
			}else{
				int o = 0;
				for(int x = 0; x<numeros.length; x++){
					if(numeros[x] == a){
						o = 1;
					}
				}
				if(o == 1){
					i = i - 1;
				}else if(o == 0){
					numeros[i] = a;
				}
			}
		}
		System.out.println("Los valores del vector son:");
		for(int i=0; i<numeros.length; i++){
			System.out.print("["+numeros[i]+"]");
		}} 

	}

}
