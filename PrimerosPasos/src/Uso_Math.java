

/*video 9*/


public class Uso_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.sqrt(89089));
		
		System.out.println(Math.sqrt(25));
		
		System.out.println(Math.round(9.16546654650
				));
		
		System.out.println(Math.round(25.0		));
		
		
		/*video 10*/
		
		/* esto que viene da ERROR porque toma "double" en vez de float
		 * y ese round que toma "double NO DVUELVE entero
		 * hay otro "round" que SI devuelve entero, pero toma "float"
		 * como parámetro, y float hay que indicarlo con F al final del número
		 
		
		int resultado = Math.round(5.77); 
		
		o sea ASI: */ 
		int resultado = Math.round(5.4F );
		
		System.out.println(resultado);
		
		/* ahora bien... ¿¿qué pasa si el valor 5.4 viene de una variable */
		 
		double numero=3.4;
		
		int resultadoo= (int)Math.round(numero); 
		
		/*ese (int) es un CASTING o REFUNDICION
		 * que cambia el timpo prmitivo a otro, pero ojo
		 * porque puede pérder parte del valor numérico  
		 */
		
		System.out.println(resultadoo);
		
		
		resultadoo++;
		System.out.println(resultadoo);
		
		
		resultadoo++;
		System.out.println(resultadoo);
		
		resultadoo++;
		System.out.println(resultadoo);
		
		resultadoo++;
		System.out.println(resultadoo);
		
		int m=7; int n=7; int a=2*++m;
		System.out.println(a);
		
		int b=2*n++; //NO LO ENTIENDO  
		System.out.println(b);
		
		
		System.out.println(resultadoo);
		
		
		
		
		
		
		
		
	}

}
