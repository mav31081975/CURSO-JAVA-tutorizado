package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   video 24    evalua varias cosas
		/* menos de 18  muy joven
		 * entre 18 y 40 joven
		 * entre 40 y 65 madura etd
		 */
		
	int edad;
		
		edad=Integer.parseInt(JOptionPane.showInputDialog
				("teclee su edad"));
		
		if (edad<18) {
			System.out.println("sos un pendejo");
			
			
		}else if (edad<40) {
			
			System.out.
			println("sos un jòven,no muy jóven");
		}else if (edad<65) {
			
			System.out.println("sos un maduro");
			
		} else {System.out.println("sos un viejo");
		
		}
		
	}

}
