package lista07;

public class Ex07Fibonacci {

	public static void main(String[]args) {
		
		int contador = 0;
		int primeiro = 0;
		int segundo = 1;
		
		while(contador < 15) {
		
		int proximo  = primeiro + segundo;
		primeiro  = segundo;
		segundo  = proximo;
		contador++;
		System.out.println(primeiro);
		}
		}
	
}
