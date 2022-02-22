package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Conjetura_de_Collatz {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int numero_final= Integer.parseInt
				(JOptionPane.showInputDialog
						("escribi hasta que nùmero querès que se verifique Collatz... y no te zarpes, esto es un programa bàsico "));
		
		int numero_inicial=1;
		
		int numero=2;
		
		while (numero_inicial!=numero_final)  { //falta la llave de apertura 
			
			
		
				
		/*System.out.println(numero);
		int numero1=numero;
		
		int iteraciones=0;*/
		
		int iteraciones=0;
		
		while (numero!=1) {
		
		
		
			
			int mitad= numero/2;
			
			//System.out.println(mitad);
			
			if (mitad*2==numero) {System.out.println("el número es par, por ende lo divido por 2");
			numero= numero/2;
			System.out.println("la mitad es " + numero);
			iteraciones++;
			numero_inicial++;
			}
			
			else {System.out.println("el numero es impar");
			System.out.println("multiplico por 3 y le sumo 1 y queda "+ (numero*3+1));
			numero=numero*3+1;
			iteraciones++;
			numero_inicial++;
			}
			
					
			
			
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("se necesitaron "+ iteraciones+ " iteraciones para llegar al número 1");
		
		System.out.println("");
		System.out.println("");
		
		//System.out.println("Por ende se verifica la Conjetura de Collatz para el número "+ numero1);
		
		}
		
		
}



}
