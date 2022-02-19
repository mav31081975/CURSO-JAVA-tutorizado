package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_if 

{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		//comprar un coche si soy mayor y tengo carnet
		
		int edad=Integer.parseInt
				(JOptionPane.showInputDialog
						("introduce tu edad"));
		
		if (edad>=18 ) 
		
		{
		
		String carnet=JOptionPane.showInputDialog("tenes carnet?");
		
		if (carnet.equalsIgnoreCase("si")) 
		{JOptionPane.showMessageDialog(null, "comprá" );}
		else {JOptionPane.showMessageDialog(null, "vas a chocar, mejor no te vendo" );}
		
			
		}
		else {JOptionPane.showMessageDialog(null, "no hay posibilidad, sos menor de edad" );}
		
			
		
	}

}
