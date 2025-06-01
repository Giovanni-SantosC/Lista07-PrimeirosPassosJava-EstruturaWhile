package lista07;

import java.util.Scanner;

public class Ex09MediaAritmetica {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Media Aritmética: ");
		
		int contador = 0;
		double soma = 0;
		
		while(contador < 10) {
			
			System.out.println("Digite o " +(contador + 1) + "º Numero: " );
			soma += sc.nextInt();
			contador++;
		}
		
		double media = soma / 10;
		System.out.println("Media de Todos os Valores Inseridos é: " + media );
		
		sc.close();
	}
	
	
}
