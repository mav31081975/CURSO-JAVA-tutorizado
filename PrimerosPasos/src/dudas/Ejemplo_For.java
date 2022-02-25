package dudas;

public class Ejemplo_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//código que imprima el saludo   10 veces
		
		for(int i=0;  //este código funciona mal (pero funciona), en cambio con "double i=0" funciona bien
				i<10;
				  i+=0.5) // esto es lo que probé diferente a tu explicación 
			
		{ //para que cierre la llave Eclpse, darle ENTER
			System.out.println("hola");   
			
			System.out.println(i);
			
			/* Hola Juan: la consulta es esta: en tu video 32 del curso JAVA TUTORIZADO
			 * 
			 *en tiempo 13:15 haces el incremento en 2 con "i+=2" y funciona copmo esperaba
			 *
			 *yo intenté probar con un incremento decimal i=+0.5 esperando que me diera error
			 *
			 *de tipo de dato o bien que ejecutare el bucle 20 veces,
			 *
			 *pero para mi sorpresa se "tilda" y ejecuta el bucle sin parar
			 *
			 *¿Por qué pasa esto? no me da ningún error o advertencia, 
			 *
			 *simplemente ejecuta el programa indefinidamente
			 *
			 *¿el "i+=2" funciona solamente con enteros?
			 *
			 *si a i lo defino como double SI funciona, 
			 *
			 *pero mi duda es por qué no da error alguno si i es int
			 * 
			 */


			
		}
		
		
		
	}

}
