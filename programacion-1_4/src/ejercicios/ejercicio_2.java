package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_2 {

	public static void main(String args[]) {

		try (Scanner dato = new Scanner(System.in)) {
			int info = 0;	
			
			System.out.println("Ingrese la dimencion del vector");
			info = dato.nextInt();
			
			int numeros[] = new int[info];
			
			for(int i=0; i<numeros.length; i++){
				System.out.println("Ingrese el valor #" + (i+1));
				int a = dato.nextInt();
				if(a%7 == 0){
					System.out.println("No se aceptan multiplos del 7");
					i = i - 1;
				}else{
					int o = 0;
					for(int x = 0; x<numeros.length; x++){
						if(numeros[x] == a){
							o = 1;
						}
					}
					if(o == 1){
						System.out.println("Este valor ya existe");
						i = i - 1;
					}else if(o == 0){
						numeros[i] = a;
					}
				}
			}
			Arrays.sort(numeros);
			System.out.println("Los valores del vector son:");
			System.out.println(Arrays.toString(numeros));
		}
}

}

