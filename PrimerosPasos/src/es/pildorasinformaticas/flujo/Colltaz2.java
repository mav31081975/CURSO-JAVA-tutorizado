package es.pildorasinformaticas.flujo;
import javax.swing.JOptionPane;
public class Colltaz2 {
	public static void main(String[] args) {
		
		//funciona imprimiendo todo en panatalla desde 1 a 1343, luego ya al 1344 obvia los primeros 271 n�meros  ��c�mo hago para verlos?
		//para otros intervalos igual de largos que (1,1342) tambi�n obvia muchos1
		
		
		final int NUMERO1= Integer.parseInt //desde que numero quiero verificr la conjetura,
				(JOptionPane.showInputDialog
						("escribi un entero desde el que quieras  verificar collatz, NO EL 1 QUEES TRIVIAL "));
				
		final int NUMERO2= Integer.parseInt  //hasta qu� n�mero quiero verificar la conjetura								
				(JOptionPane.showInputDialog
						("escribi un entero hasta el que quieras  verificar collatz, ojo, tiene que ser mayor o igual al anterior "));
		
		
		int numero_inicial=NUMERO1;
		int iteraciones_totales=0;
		
		while (numero_inicial<NUMERO2+1) 
		
		{
				int numero= numero_inicial;
						
				//System.out.println(numero);
				//int numero1=numero; // es necesario????
			
				int iteraciones=0;
				
				//int iteraciones_totales=0;
				
								
				while (numero!=1) {
				
					double mitad= numero/2;
					
					if (mitad*2==numero) {//System.out.println("el n�mero es par, por ende lo divido por 2");
					numero= numero/2;
					//System.out.println("la mitad es " + numero);
					iteraciones++ ;
					
					
					//numero_inicial++;
					}
					
					else {//System.out.println("el numero es impar");
					//System.out.println("multiplico por 3 y le sumo 1 y queda "+ (numero*3+1));
					numero=numero*3+1;
					iteraciones++;
					
					} 
					
								}
				
				System.out.println("Para el n�mero " + numero_inicial+ " se necesitaron "+ iteraciones+ " iteraciones para llegar al n�mero 1");
				numero_inicial++;
				iteraciones_totales=iteraciones_totales+iteraciones;
				
				//System.out.println("Por ende se verifica la Conjetura de Collatz para el n�mero "+ numero1);
				//numero_inicial=numero;
			
		}

			System.out.println("Se necesitaron "+iteraciones_totales+ " iteraciones en total");
	}
	
}
	
	
		
		