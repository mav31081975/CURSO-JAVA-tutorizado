 package es.pildorasinformaticas.entrada_salida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner(System.in); //creé mi primero BOJETO!!
		
		/*ese objeto pertenece a la clase scanner y DECIDI llamarlo entrada
		 * ese objeto escanea la consola (system) a la espera de info
		 */
		
		System.out.println("Introduce tu nomnbre"); // espera por consola un string
		
		String nombre=entrada.nextLine();
		
		System.out.println("hola " + nombre); // me saluda!
		
		
	}

}
