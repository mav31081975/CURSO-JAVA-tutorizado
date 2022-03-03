import javax.swing.JOptionPane;

// control de fluj video  33 ejercicio email correcto


public class Resolucionejerciciospropuestos33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean valido=false;
		
		do {
			
			String email=JOptionPane.showInputDialog("pon el email");
			
			int arroba=0;
			
			boolean punto= false;//por que boolean
			
			for (int i=0; i<email.length();i++) {
				
				if (email.charAt(i)=='@') arroba++ ;//COMILLA SIMPLE EN DATO CHAR PRIMITIVO EN EL ? ESTA
				
				if (email.charAt(i)=='.') punto=true;
				
				
				
			}if (arroba==1 && punto==true && email.length()>3) valido=true;
			else JOptionPane.showMessageDialog(null, "email no valido");
			
			
			
		}while (valido==false);///estudiar por que usa do while
		
		System.out.println("gracias");
		
		JOptionPane.showMessageDialog(null, "genial");
		

	}

}
