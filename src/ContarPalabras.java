
public class ContarPalabras {
	public static void main(String[] args) {
		String Texto = "Es la primera obra genuinamente desmitificadora de la tradici�n caballeresca y "
				+ "cort�s por su tratamiento burlesco. Representa la primera novela moderna y la primera "
				+ "novela polif�nica; como tal, ejerci� un enorme influjo en toda la narrativa europea. "
				+ "Por considerarse �el mejor trabajo literario jam�s escrito�, encabez� la lista de las"
				+ " mejores obras literarias de la historia, que se estableci� con las votaciones de cien"
				+ " grandes escritores de 54 nacionalidades a petici�n del Club Noruego del Libro en 2002; "
				+ "as�, fue la �nica excepci�n en el estricto orden alfab�tico que se hab�a dispuesto.";
		char[] Contador = Texto.toCharArray();
		int total = 0; 
		
		for(int i=0; i<Contador.length;i++) {
			total = i;
		}
		System.out.println("Tiene "+ total + " caracteres");
	}
}
