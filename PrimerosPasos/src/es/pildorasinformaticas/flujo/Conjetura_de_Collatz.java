package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Conjetura_de_Collatz {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// evaluara la conjetura de collatz, llamada "3n + 1" , dado un entero de dato ingresado
		
		int numero= Integer.parseInt
				(JOptionPane.showInputDialog
						("escribi un entero no muuuuy largo"));
		System.out.println(numero);
		int numero1=numero;
		
		int iteraciones=0;
		
		
		while (numero!=1) {
		
		
		
			
			int mitad= numero/2;
			
			//System.out.println(mitad);
			
			if (mitad*2==numero) {System.out.println("el n�mero es par, por ende lo divido por 2");
			numero= numero/2;
			System.out.println("la mitad es " + numero);
			iteraciones++;}
			
			else {System.out.println("el numero es impar");
			System.out.println("multiplico por 3 y le sumo 1 y queda "+ (numero*3+1));
			numero=numero*3+1;
			iteraciones++;
			}
			
					
			
			
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("se necesitaron "+ iteraciones+ " iteraciones para llegar al n�mero 1");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Por ende se verifica la Conjetura de Collatz para el n�mero "+ numero1);
		
		
}



}
