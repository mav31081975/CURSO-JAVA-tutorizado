 package es.pildorasinformaticas.entrada_salida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner(System.in); //creé mi primero BOJETO!!
		
		//hay una advertencia que scanner no se cerró, consume recursos (explica en 6:00)
		
		/*ese objeto pertenece a la clase scanner y DECIDI llamarlo entrada
		 * ese objeto escanea la consola (system) a la espera de info
		 */
		
		System.out.println("Introduce tu nomnbre"); // espera por consola un string
		
		//System.out.println("");
		
		String nombre=entrada.nextLine();
		
		System.out.println("hola " + nombre);// me saluda!
		
		System.out.println("+++++++++ video 19   nextint   +++++++++++++++++++++++++++"); 
		
		System.out.println("Introuduce el primer número "); 
		
		int numero1=entrada.nextInt();
		
		System.out.println("Introuduce el segundo número "); 
		
		int numero2=entrada.nextInt();
		
		System.out.println("la suma de esos números es " + (numero1+numero2));// 
	
		
		entrada.close(); //esto cierra elscanner y quita la advertencia en línea 11(no era error)
		
		 //System.out.println("############################  video  20   #########################################");
		 
		
		/*
		 * 
		 * 
		 Scanner entrada2=new Scanner(System.in);
		 
		 System.out.println("Introduce tu nombre");
		 
		 String nombre2=entrada2.nextLine();
		 
		 System.out.println("introduce tu edad");
		 
		 int edad=entrada2.nextInt();
		 
		 System.out.println("Te llamas "+ nombre2+ "y tienes " + edad + " años");
		 
		 entrada2.close()
		 
		
		 *por que mierda eso no funciona???
		 *
		 *
		 */
		 
		 
		 
		 
		
		
		
		
	}

}


