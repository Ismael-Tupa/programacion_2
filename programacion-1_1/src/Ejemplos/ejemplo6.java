package Ejemplos;
import java.util.Scanner;
public class ejemplo6 {

	public static void main(String[] args) {
		String nom, cont;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Usuario: ");
		nom = entrada.nextLine();
		
		System.out.print("Contrase�a: ");
		cont = entrada.nextLine();
		
		if((nom.equals("Enzo"))&(cont.equals("4321"))){
			System.out.println("Iniciando sesi�n....");
			System.out.print("Inicio de sesi�n corecto");
		}else if((nom.equals("Enzo"))&(cont != "4321")){
			System.out.print("Contrace�a incorecta!!");
		}else if((nom != "Enzo")&(cont.equals("4321"))){
			System.out.print("Usuario incorecto");
		}else {
			System.out.print("Usuario y contrace�a incorecto");
		}
	}

}
