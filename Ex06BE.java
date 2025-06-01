package lista07;

import java.util.Scanner;

public class Ex06BE {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculo da Potencia B^E:");
		
		System.out.println("Digite o Valor da Base: ");
		double base = sc.nextDouble();
		
		System.out.println("Digite o Valor do Expoente: ");
		int expoente = sc.nextInt();
		
		double resultado = calcularPotencia(base , expoente);
		sc.close();
		
		System.out.println(base + " ^ " + expoente + " = " + resultado);
	}
	
	public static double calcularPotencia(double base , int expoente){
		double resultado = 1.0;
		int contador = 0;
		
		if(expoente == 0) {
			return 1.0;
		}
		else if(expoente > 0) {
			while(contador < expoente) {
				resultado *= base;
				contador++;
			}
		}
		
		else {
			while(contador < Math.abs(expoente)) {
				resultado *= base;
				contador++;
			}
			resultado = 1.0 / resultado;
		}
		return resultado;
	}
	
}
