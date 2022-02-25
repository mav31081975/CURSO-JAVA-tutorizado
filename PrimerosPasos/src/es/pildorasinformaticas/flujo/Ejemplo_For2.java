package es.pildorasinformaticas.flujo;

public class Ejemplo_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  *********************** video 33 ******* bucle for ANIDADO
				int a=0;
		for(int i=0;
				i<10;
				  i++) 
		{ //para que cierre la llave Eclpse, darle ENTER
			
			for (int j=0;j<10;j++)
			{
				System.out.println("hola"+" "+j+" "+ i+ "    " + a++); //ojo la primera "a" es la cero pese al ++
			}
			
			
		}
		
		System.out.println("saliste del bucle");
		
		
		
		
		
	}

}
