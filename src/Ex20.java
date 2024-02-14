import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//20. Escreva um programa Java que aceite três valores inteiros e retorne true
		//se um deles for 20 ou mais e menor que as subtrações dos outros.
		
		System.out.println("Entre com o primeiro número:");
		int a = sc.nextInt();
		System.out.println("Entre com o segundo número:");
		int b = sc.nextInt();
		System.out.println("Entre com o terceiro número:");
		int c = sc.nextInt();
		
		boolean resultado = (a >= 20 && (a < b - c || a < c - b)) ||
							(b >= 20 && (b < a - c || a < c - a)) ||	
							(c >= 20 && (c < b - a || c < a - b));
		
		System.out.println("O resultado é:" + resultado);
		
		
		
		
		
		
		sc.close();
	}

}
