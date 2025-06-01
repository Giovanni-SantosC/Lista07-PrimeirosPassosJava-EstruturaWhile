package lista07;

import java.util.Scanner;

public class Ex11AreaTotalResidencia {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double areaTotal = 0.0;
		String continuar = "SIM";
		
		System.out.println("Calculadora de Área Total da Residência: ");
		
		while(continuar.equalsIgnoreCase("SIM")) {
			System.out.println("Digite o Nome do Cômodo: ");
			String nomeComodo = sc.nextLine();
			
			System.out.println("Digite a Largura do(a) " + nomeComodo  + " (em Metros): ") ;
			double largura = sc.nextDouble();
			
			System.out.println("Digite o comprimento do(a) " + nomeComodo  + " (em Metros): ") ;
			double comprimento = sc.nextDouble();
			
			double areaComodo = largura * comprimento;
			 System.out.printf("Area do(a) %s: %.2f metros quadrados.\n", nomeComodo, areaComodo);

			 areaTotal += areaComodo;
			 
			 System.out.println("Deseja Calcular Area de Mais Algum Como? (SIM/NAO):");
			 sc.nextLine();
			 continuar = sc.nextLine();
			 
		}
		
        System.out.printf("Area total da residência: %.2f metros quadrados.\n", areaTotal);
		
		sc.close();
	}
	
}
