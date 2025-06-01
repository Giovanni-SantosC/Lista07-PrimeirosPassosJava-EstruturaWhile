package lista07;

public class SomaDosNumerosParesDe1a500 {

	public static void main(String[]args) {
		
		int soma = 0;
		int numero = 2;
		
		
		while(numero <= 500) {

		soma += numero;
		numero += 2;
	}
		System.out.println(soma);
}
}
