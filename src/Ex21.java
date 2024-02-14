import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//21. Escreva um programa Java para calcular os módulos de dois números 
		//sem usar nenhum operador de módulo embutido
		
		System.out.println("Entre com o primeiro número:");
		int n1 = sc.nextInt();
		System.out.println("Entre com o segundo número:");
		int n2 = sc.nextInt();
		
		int divisao = n1 / n2;		
		int valorIntermediario = divisao * n2;		
		int modulo = n1 - valorIntermediario;
		
		System.out.println("O modulo de " + n1 + " % " + n2 + " é:" + modulo);
		
		//Coloquei com o operador de modulo para confirmar o resultado
		int modulo2 = n1 % n2;
		System.out.println(modulo2);
		
		
		
		
		sc.close();

	}

}
