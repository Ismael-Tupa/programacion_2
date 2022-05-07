package Ejemplos;
import java.util.Scanner;
public class ejemplo {
  public static void main(String[] args){
	  Scanner entrada = new Scanner(System.in);
	  int A,B,Res;
	  System.out.print("Este programa imprime la suma entre dos valores");
	  System.out.print("Dame el primer valor: ");
	  A = entrada.nextInt();
	  System.out.print("Dame el segudo valor: ");
	  B = entrada.nextInt();
	  Res = A+B;
	  System.out.print("El resultado es: ");
	  System.out.print(Res);
	  
	  
  }
}
