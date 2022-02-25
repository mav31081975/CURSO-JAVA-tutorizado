package dudas;

import javax.swing.JOptionPane;

public class Ejercicios_video_33 {

	public static void main(String[] args) {
				
		// TODO Auto-generated method stub

		/* EJERCICIO 2 FACTORIAL
		 * 
		 * se pide un numero por JOptionPane y se debe dar su factorial
		 * 
		 * 
		 *    no hay dudas en este ejercicio, funciona de maravilla edntro del rango int
		 * 
		 * */
		int  numero;
		
		int factorial=1;
		
		
		 numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número natural"));
		 
		while (numero>1) {
			
			factorial=numero*factorial;
			numero--;
			
			
			
		}
		System.out.println(factorial);
			 
		 
		
	}

	
}
