
public class ClaseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String hola ="Hola"; //esta estring es una constante ahora

		System.out.println(hola.charAt(3)); //imprime el tercer caracter (empieza en cero)
		
		/* System.out.println(hola.charAt(4));
		 * 
		 * eso da error y se detiene el programa porque no hay caracter cuarto
		 */
		
		System.out.println(hola.charAt(2));
		
		System.out.println(hola.length()); //devuelve la longitud, EMPIEZA EN CERO y cuenta ESPACIOS en blanco, no es que no hace nada
		
		String vacio="                              ";
		
		System.out.println(vacio.length()); 
		
		System.out.println(vacio.charAt(2)); //ImPRIME un espacio vacío 
		
		System.out.println(hola.charAt(2));
		
		System.out.println(hola.valueOf("ij"));
		
		
		/* este es el segundo video del dia 15, debo hacer alñ men9s 4*/
		
		System.out.println("La primera letra de " + hola + " es " + hola.charAt(0) +
				" y la longitud total de la palabra es de " + hola.length()+ " caracteres") ;
		
		//La primera letra de Hola es H y la longitud total de la palabra es de 4 caracteres   GENIAL
		
		int ultimaletra=hola.length();
		System.out.println(ultimaletra);
		
		int ultimoindice=ultimaletra-1;
		System.out.println(ultimoindice);
		
		System.out.println("La primera letra de " + hola + " es " + hola.charAt(0) +
				" , la longitud total de la palabra es de " + hola.length()+ " caracteres" + " y la última letra es una " + hola.charAt(ultimoindice)) ;
		
		/* La primera letra de Hola es H , la longitud total de la palabra es de 4 caracteres y la última letra es una
		 * 
		 *  como ejercicio para mas tarde: TOMAR UN TEXTO STRING Y DARLO VUELTA a*/
		
		//video 13
		
		String frase= "No hay nada mejor que levantarse un Domingo para estudiar Java";

				//le aplicaré método substring para obtener un string dentro de eso
				
		System.out.println(frase.substring(22,43)); //levantarse un Domingo 
		
		System.out.println(frase.substring(22)); //levantarse un Domingo para estudiar Java
		
		
		
		//****************************************************************
		System.out.println("************************ comparar tetos con EQUAL..............");
		
		
		
		String palabra1="Casa";
		
		String palabra2="Casa";
		
		System.out.println(palabra1.equals(palabra2)); // true
		
		String palabra3="casa";
		
		System.out.println(palabra1.equals(palabra3)); //false  : este método compara mayusculas y minusculas, son diferwentes
		
		System.out.println(palabra1.equalsIgnoreCase(palabra3)); //true (ignora las mayúsculas  
		
				
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
