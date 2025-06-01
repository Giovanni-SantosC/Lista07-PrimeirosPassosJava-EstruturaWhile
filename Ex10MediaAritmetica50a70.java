package lista07;

public class Ex10MediaAritmetica50a70 {

	public static void main(String[]args) {
		
		int contador = 50;
		int soma = 0;
		int divisao = 0;
		
		while(contador <= 70) {
			if(contador % 2 == 0) {
				soma += contador;
				divisao++;
				System.out.println(contador);
			}
			contador++;
		}
		
		double media = (double) soma / divisao;
		System.out.println("A Media de Numeros Pares Entre 50 a 70 é " + media);
	}
	
}
