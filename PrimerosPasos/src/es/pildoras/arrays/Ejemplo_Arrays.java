package es.pildoras.arrays;

//netbook 3 arlenghi 7 2 3 3 21
public class Ejemplo_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// vido  36
		
		int [] valores =new int[5];
		//asi se declara un array vacio de 5 lugares,
		// pero el indice es 4 (0 a 4)
		// los ARRAYS tienen un solo tipo de datos, en este caso son todos enteros
		//relleno
		int ab=87678;
		valores [0]=ab;
		valores [1]=-15;
		valores [2]=15;
		valores [3]=1500;
		valores [4]=1500;
		System.out.println(valores[3]);
		System.out.println(valores[4]); //si no se da un vaor lo asume CERO
		//otr forma implicita de declarar un array
		
		int []valores2= {ab,5,7};  //los corchetes pueden ir despues del nombre 
		System.out.println(valores2[1]);
		
		for (int i =0;   i<valores.length  ;i++) {
			
			System.out.println(valores  [i]	);
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
			
			}
			
			//  bucle for mejorado
		System.out.println("**************************");
		System.out.println("BUCLE FOR EACH");
		
		int mimatriz[]= {1,2,3,4,65};
		
		
			for (int variabless:mimatriz ) {
			System.out.println(variabless);
			
			//notar que no dice EACH coomo en otros lenguajes
			//recorre todos los elementos del array sin saber su longitud
			//está piola
			
				
			
		}
			System.out.println("**************************");
			String letra= "a";
			System.out.println(letra); // una letra puede ser char o string, ojo
			
			System.out.println("**************************");
			
			//array de strings
			System.out.println("arrays de strings");
			
			String nombresdegente[]= {"jaun,","maria"};
			
			
		
		
		

	

}
	
}
