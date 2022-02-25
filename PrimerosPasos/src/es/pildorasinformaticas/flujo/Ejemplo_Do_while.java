package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_Do_while {  //video 31... no termine elcodigo, no lo comprendi del todo

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Este mensaje cuenta los caracteres de la frase introducida \n"
				+ "para terminar escribe salir");
		
		String texto="";  
		 
		while(!texto.equals("salir"))   {
			//o sea mientras el texto ingresado NO SEA "salir"
		texto=JOptionPane.showInputDialog("Introduce el texto");
		
		JOptionPane.showMessageDialog(null, "el texto tiene "+ texto.length()+ " caracteres (incluye espacios)");
		
		
		
		
		
		}
		
		
		
		
		
		
		}
		
	}


