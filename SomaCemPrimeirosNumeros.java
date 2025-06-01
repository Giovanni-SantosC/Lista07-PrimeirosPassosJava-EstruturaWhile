package lista07;

public class SomaCemPrimeirosNumeros {

	public static void main(String[]args) {
		
		int numero = 1;
		int valor = 0;
		
		
		while(numero < 101) {
			
			valor += numero;
			numero++;
		}
		
		System.out.println(valor);
		
	}
	
}
