package lista07;

import java.util.Scanner;

public class Ex12MenorEMaiorNumeroDigitado {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Encontrar Valor Inteiro Maior e Menor Digitado:");
		System.out.println("Digite um Valor Inteiro (Digite um Numero Negativo para Parar o Programa):)");
		
		Integer maiorValor = null;
		Integer menorValor = null;
		int valor = 0;
		
		System.out.println("Digite um Valor: ");
		valor = sc.nextInt();
		
		while(valor >= 0) {
			if(maiorValor == null || valor > maiorValor) {
				maiorValor = valor;
			}
		    if(menorValor == null || valor < menorValor) {
				menorValor = valor;
			}
			
			System.out.println("Digite um Valor: ");
			valor = sc.nextInt();
		}
		
		System.out.println("\nResultados: ");
		if(maiorValor != null && menorValor != null) {
			System.out.println("Maior Valor Informado: " + maiorValor);
			System.out.println("Menor Valor Informado: " + menorValor);
		}
		else {
			System.out.println("Valor Inserido Invalido!");
		}
		
		sc.close();
	}
	
}
