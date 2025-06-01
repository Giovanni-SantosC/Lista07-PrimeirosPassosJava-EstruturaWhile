package lista07;

public class Ex08CelsiusFahrenheit {

	public static void main(String[]args) {
		
		int celsius = 10;
		double fahrenheit = 0;
		
		System.out.println("Conversão de Celsius para Fahrenheit: ");
		while(celsius < 101) {
			
			fahrenheit = (celsius * 9.0 / 5.0 ) + 32;
			
			System.out.println("Temperatura Celsius: " + celsius);
			System.out.println("Temperatura em Fehrenheit: " + fahrenheit);
			celsius = celsius + 10;
		}
	
	}
	
}
