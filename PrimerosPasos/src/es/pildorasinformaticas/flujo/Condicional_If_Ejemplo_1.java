package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// video 22
		
		int edad;
		
		edad=Integer.parseInt(JOptionPane.showInputDialog("teclee su edad"));
		/*showInputDialog devuelve STRING, hay que covertirlo
		 * antes con paresInt
		 */
		
		if (edad>=18) {
			
			System.out.println("podes pasar, sos viejo");
		}
		else {System.out.println("sos pendejo");}
				
				
		
		 
		
		
		
		
	}

}  
