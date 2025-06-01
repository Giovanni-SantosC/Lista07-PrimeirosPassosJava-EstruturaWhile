package lista07;

public class ValoresImparesDe0a20 {

	public static void main(String[]args) {
	
		
		int numero = 0;
		
		while(numero <= 20) {
			
			if( !(numero % 2 == 0)) {
				System.out.println(numero);
			}
			numero++;
		}
		
		
	}
	
}
