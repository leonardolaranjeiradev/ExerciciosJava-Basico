import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 12. Escreva um programa Java para trocar duas variáveis
		// Trocar duas variáveis refere-se a trocar mutuamente os valores das variáveis.
		// Geralmente, isso é feito com os dados na memória.

		int a, b, c;
		System.out.println("Entre com o primeiro número:");
		a = sc.nextInt();
		System.out.println("Entre com o segundo número:");
		b = sc.nextInt();

		c = a;
		b = c;
		a = b;

		System.out.println("A:" + a + " B:" + b + " C:" + c);

		sc.close();

	}

}
