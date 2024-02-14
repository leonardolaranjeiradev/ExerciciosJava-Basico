import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 10. Escreva um programa Java que receba cinco números como entrada para
		// calcular e imprimir a média dos números.

		System.out.println("Escreva o primeiro número:");
		int nu1 = sc.nextInt();
		System.out.println("Escreva o segundo número:");
		int nu2 = sc.nextInt();
		System.out.println("Escreva o terceiro número:");
		int nu3 = sc.nextInt();
		System.out.println("Escreva o quarto número:");
		int nu4 = sc.nextInt();
		System.out.println("Escreva o quinto número:");
		int nu5 = sc.nextInt();

		int mediaNumeros = (nu1 + nu2 + nu3 + nu4 + nu5) / 5;

		System.out.println("A média dos cinco números é:" + mediaNumeros);
		sc.close();
	}
}
