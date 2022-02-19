package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicioal_if_ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* video 25****************
		 * tiene beca o no?
		 * 
		 * derecho: vivir a mas de 10km y ademas renta 
		 * familiar a 20000 . AMBAS
		 * 
		 * aca necesito el operador & 
		 */

		double nn=2864644655555555555555555555555555555555555556546546546561.129651651651651862;
		int distancia_colegio; //INT PORQUE ES KILOMETROS ENTEROS
		
		double renta_familiar; //double porque puede haber centavos
		
		byte hermanos_en_el_instituto;
		distancia_colegio=Integer.parseInt //convierte a enteros un string
				(JOptionPane.showInputDialog //solamente acepta string
						("decime tu distancia al colegio en kilometros enteros por favor"));
		
		renta_familiar= Double.parseDouble //pasa a decimal un string decimal
				(JOptionPane.showInputDialog("cuàl es la renta familiar?")); //solamente toma string
		

		hermanos_en_el_instituto= Byte.parseByte
				(JOptionPane.showInputDialog
						("cuàntos hermanos ya están cursando en el instituto"));
				
		if (distancia_colegio>10 
				|| renta_familiar<20000 
				&& hermanos_en_el_instituto>1)
		// || opera como "O" (or)  && opera como "Y" (and)
		{
			
			System.out.println("Tiene beca");
		} else {
			
			System.out.println("no tenés beca, abusivo");
			
			
		}
		
		
	
		
		
		
	}

}
