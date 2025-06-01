package lista07;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Valor Para Tabuada: ");
		int numero = sc.nextInt();
		
		int valor = 0;
		while(valor < 51 ) {
			
			System.out.println(numero +  " X " + valor + " = " + numero * valor);
			
			valor++;
		}
		
		sc.close();
	}
	
}
