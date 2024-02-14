import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//15. Escreva um programa Java que aceite um inteiro (n) e calcule o valor de n+nn+nnn.

		System.out.println("Number:");
		int number = sc.nextInt();

		System.out.printf("%d + %d%d + %d%d%d%n", number, number, number, number, number, number);

		sc.close();
	}

}
