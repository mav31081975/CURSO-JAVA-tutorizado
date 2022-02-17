

package es.pildorasinformaticas.entrada_salida;

import java.util.Scanner;

public class EntradaScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner entrada=new Scanner (System.in);
		

		System.out.println("introduce tu edad");
		
		int edad=entrada.nextInt();
		
		System.out.println("Introduce tu nombre");
		
		entrada.nextLine();
		
			
		String nombre=entrada.nextLine();
		
						
		 
		
		
		
		
		System.out.println("te llamas "+nombre+ " y tenes  "+ edad + " años");
		
		
		
		
		
		
		
		

	}

}
