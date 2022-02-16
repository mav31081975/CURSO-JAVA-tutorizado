// Java Tutorizado. Ejercicios. Clase Math y Casting


public class EjercicioMathYCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ejercicio 1 
		
		int numero;
		int resultado;
		 numero=9;
		 resultado=(int)Math.sqrt(numero);
		 
		 System.out.println("La raiz cuadrada de " + numero + " es "+ resultado);
		 
		 
		 int base, exponente;
		 base=9875;
		 exponente=15462;
		 long resultado2=(long)Math.pow(base, exponente);
		 
		 System.out.println(base+ " elevado a la potencia "+ exponente + " es igual a " + resultado2);
		 
		 /*DUDa: SI MATH.POW REQUIERE PARAMETROS double ¿POR QUÈ ACÀ LOS TOMA COMO INT?)* 
		  * 
		  * rta: porque los convierte si es necesario automatico
		  */
		 
		 
		 
		 
		 
		 
		
		
		
		
	}

}
