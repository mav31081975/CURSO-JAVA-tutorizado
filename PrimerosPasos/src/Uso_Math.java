

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
		 * como par�metro, y float hay que indicarlo con F al final del n�mero
		 
		
		int resultado = Math.round(5.77); 
		
		o sea ASI: */
		int resultado = Math.round(5.4F);
		
		System.out.println(resultado);
		
		
		
		
		
	}

}
