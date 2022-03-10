package dudas;

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
			
			String nombresdegente[]= {"jaun","maria","elton","hhh"};
			
			for (int i=0;i<nombresdegente.length; i++)	
			{
				System.out.println(nombresdegente[i]);
			}
			
			//ahora usar for each, pero no vale variable int, ojo
			
			for (String elementos:nombresdegente)
			{
				System.out.print(elementos+" "); //es mas comodo FOR EACH
				
			}
			
			System.out.println(" "); 
			System.out.println(" "); 
			System.out.println(" "); 
			System.out.println(" "); 
			System.out.println("**************************************** "); 
			
			System.out.println(" "); 
			System.out.println("arrays de dos dimensiones VIDEO 37 "); 
			// tienen dos indices y son de un solo tipo de datos
			
			int [][] numeros=new int [5][3];
			
			int [][] [] numeross=new int [5][3][8];
			
			numeross [0] [0] [7] =5555;
			System.out.println(numeross[0][0][7]);
					
			
			numeros [0] [0] =5  ;// rellena asi pero es pesado
			numeros [1][2] =4  ;
			numeros [4] [2] =856  ;
			System.out.println(numeros[0][0]);
			
			// se usan bucle for anidado para verlo
			// el "padre" recorre la primera dimensión
			//el bucle "hijo" a la segunda
			
			for (int i=0;i<5;i++) {
				for (int z=0;z<3;z++) {
				System.out.print(numeros[i][z] + " ");	
				}
				System.out.println();
				
								
			}
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("****************************VIDEO  38***Relleno simpleficado de arrays");
			
			int array38 [][]={{1,2,3,4},{5,6,4,8},{9,10,11,12}};
			
			for (int i=0;i<5;i++) {
				for (int z=0;z<4;z++) {
						
						System.out.println(array38);}
				
				/*qué pasa a partir de la linea 119 que me imprime un array
				 * literlmente así  :
				 [[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
[[I@cac736f
				 */
			}
			
			
			
		
		

	

}
	
}
