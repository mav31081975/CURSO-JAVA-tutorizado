package es.pildorasinformaticas.flujo;
import javax.swing.JOptionPane;
public class Colltaz2 {
	public static void main(String[] args) {
		
		final int NUMERO1= Integer.parseInt //desde que numero quiero verificr la conjetura,
				(JOptionPane.showInputDialog
						("escribi un entero desde el que quieras  verificar collatz, NO EL 1 QUEES TRIVIAL "));
				
		final int NUMERO2= Integer.parseInt  //hasta què nùmero quiero verificar la conjetura								
				(JOptionPane.showInputDialog
						("escribi un entero hasta el que quieras  verificar collatz, ojo, tiene que ser mayor o igual al anterior "));
		
		
		int numero_inicial=NUMERO1;
		
		
		while (numero_inicial<NUMERO2) 
		
		{
				int numero= numero_inicial;
						
				System.out.println(numero);
				//int numero1=numero; // es necesario????
			
				int iteraciones=0;
								
				while (numero!=1) {
				
					int mitad= numero/2;
					
					if (mitad*2==numero) {System.out.println("el número es par, por ende lo divido por 2");
					numero= numero/2;
					System.out.println("la mitad es " + numero);
					iteraciones++;
					}
					
					else {System.out.println("el numero es impar");
					System.out.println("multiplico por 3 y le sumo 1 y queda "+ (numero*3+1));
					numero=numero*3+1;
					iteraciones++;
					}
					numero_inicial++;
								}
				//System.out.println("se necesitaron "+ iteraciones+ " iteraciones para llegar al número 1");
				//System.out.println("Por ende se verifica la Conjetura de Collatz para el número "+ numero1);
				//numero_inicial=numero;
			
		}

			System.out.println("oooo");
	}
	
}
	
	
		
		