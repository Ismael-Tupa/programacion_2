package Ejemplos;

import java.util.Scanner;

public class ejemplo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Dnom="Enzo", Dcont="4321";
		String nom, cont;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Usuario: ");
		nom = entrada.nextLine();
		
		System.out.print("Contraseña: ");
		cont = entrada.nextLine();
		
		if((nom.equals(Dnom))&(cont.equals(Dcont))){
			System.out.println("Iniciando sesión....");
			System.out.println("Inicio de sesión corecto");
			System.out.println("Usurio: "+Dnom);
			System.out.println("Contraseña: "+Dcont);
			System.out.println("Si deseas cambir tus datos ingresa el numero de la opcion deseada");
			System.out.println("  1 - si ");
			System.out.println("  2 - no ");
			int op = entrada.nextInt();
			if(op == 1){
				Scanner im = new Scanner(System.in);
				System.out.print("Ingrese su nueva contraseña:  ");
				Dcont = im.nextLine();
				System.out.println("Sus nuevos datos son");
				System.out.println("Usurio: "+Dnom);
				System.out.println("Contraseña: "+Dcont);
				
			}else{
				System.out.println("Gracias por su tiempo :) ");
			}
		}else if((nom.equals("Enzo"))&(cont != "4321")){
			System.out.print("Contraceña incorecta!!");
		}else if((nom != "Enzo")&(cont.equals("4321"))){
			System.out.print("Usuario incorecto");
		}else {
			System.out.print("Usuario y contraceña incorecto");
		}

	}

}
