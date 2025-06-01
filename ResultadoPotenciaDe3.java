package lista07;

import java.util.Scanner;

public class ResultadoPotenciaDe3 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int expoente = 0;
		int base = 3;
		
		while(expoente <= 15) {
			int resultado = 1;
			int contador = 0;
			
		if(expoente == 0) {
			resultado = 1;
			
		}	
		
		else if(expoente == 1) {
			resultado = base;
			
		}	
			
		
	    else {
			while(contador < expoente) {
				resultado *= base;
				contador++;
				
			}
			
		}	
		System.out.println("3 elevado a " + expoente + " = " + resultado);
        expoente++;
		}
		sc.close();
	}
	
}
