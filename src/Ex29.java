import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//29. Programa Java para converter a temperatura em Graus Centígrados para Fahrenheit
		System.out.println("Entre com a Temp. em Centigrados: "); 		 
		int c = Integer.parseInt(sc.nextLine()); 
		float f = ((9*c)/5)+32; 
		System.out.println("Temperatura em Fahrenheit e: "+f); 
		
        System.out.print("Entre com os graus em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " graus Fahrenheit e igual a " + celsius + " em Celsius");

		
		
		
		
		sc.close();

	}

}
