import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 6. Escreva um programa Java para imprimir a soma (adição), multiplicar,
		// subtrair, dividir e o resto de dois números

		System.out.println("Entre com primeiro número:");
		int num1 = sc.nextInt();
		System.out.println("Entre com o segundo número:");
		int num2 = sc.nextInt();

		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
		
		sc.close();
	}

}
