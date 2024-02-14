import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// 28. Escreva um programa Java que aceite duas variáveis duplas e teste se
		// ambas
		// estritamente entre 0 e 1 e false caso contrário

		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o primeiro num: ");
		double n1 = sc.nextDouble();
		System.out.print("Entre com o segundo num: ");
		double n2 = sc.nextDouble();
		System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
		sc.close();

	}

}
