package es.pildorasinformaticas.flujo;
import javax.swing.JOptionPane;
public class Colltaz2 {
	public static void main(String[] args) {
		
		int numero_inicial= Integer.parseInt //desde que numero quiero verificr la conjetura,
				(JOptionPane.showInputDialog
						("escribi un entero desde el que quieras  verificar collatz, NO EL 1 QUEES TRIVIAL "));
				
		int numero_final= Integer.parseInt  //hasta què nùmero quiero verificar la conjetura								
				(JOptionPane.showInputDialog
						("escribi un entero hasta el que quieras  verificar collatz, ojo, tiene que ser mayor o igual al anterior "));
		
		final int NUMERO_INICIAL=numero_inicial;
		
		final int NUMERO_FINAL=numero_final;
		
		while (numero_inicial<numero_final) 
		
		{
				int numero= NUMERO_INICIAL;
						
				System.out.println(numero);
				int numero1=numero;
				
				int iteraciones=0;
								
				while (numero!=1) {
				
					int mitad= numero/2;
					
					if (mitad*2==numero) {System.out.println("el número es par, por ende lo divido por 2");
					numero= numero/2;
					System.out.println("la mitad es " + numero);
					iteraciones++;
					numero_inicial++;}
					
					else {System.out.println("el numero es impar");
					System.out.println("multiplico por 3 y le sumo 1 y queda "+ (numero*3+1));
					numero=numero*3+1;
					iteraciones++;
					numero_inicial++;}
								}
				System.out.println("se necesitaron "+ iteraciones+ " iteraciones para llegar al número 1");
				System.out.println("Por ende se verifica la Conjetura de Collatz para el número "+ numero1);
			
		}

			
	}
	
}
	
	
		
		