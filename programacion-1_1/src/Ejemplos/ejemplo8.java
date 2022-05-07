package Ejemplos;

import java.util.Scanner;

public class ejemplo8 {

	public static void main(String[] args) {
		System.out.print("Este programa calcula las vocales de una frace");
		String cade;
		String log;
		int x=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una frace");
		cade = entrada.nextLine();
		
		for(int i=0; i<cade.length(); i++){
			log = cade.substring(i,(i+1));
			if((log.equalsIgnoreCase("a"))||(log.equalsIgnoreCase("e"))||(log.equalsIgnoreCase("i"))||(log.equalsIgnoreCase("o"))||(log.equalsIgnoreCase("u"))){
				x = x+1;
			}
		}
		System.out.print("la frace '"+cade+"' poseé "+x+" vocales");
	}

}
