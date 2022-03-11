package es.pildorasinformaticas.poo;

public class UsoVehiculos {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculos //especifico la CLASE
		 
		miCoche=new Vehiculos (); //nombre del constructor
		
		//el OBJETO es miCoche y pertenece a la CLASE vehiculos
		
		/*objeto tipo vehiculo
		 * instancia perteneciente a la clase vehiculo
		 * o hemos instanciado la clase vehiculos
		 * o sea estoy "lamando" al constructor
		 */
		System.out.println(miCoche.getColor());
		
		miCoche.setColor();
		
		System.out.println(miCoche.getColor()); //genial
		
		miCoche.setColorPuertas("anaranjado");
		
		System.out.println(miCoche.getColorPuertas()); //genial es anaranjado
		//o sea le  puse mis propios paràmetros al mètodo (funciòn) 
		
		
		
	}

}
