import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5. Escreva um programa Java que receba dois números como entrada e exiba o produto de dois números
		
		System.out.println("Entre com o primeiro número:");
		int n1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número:");
		int n2 = sc.nextInt();
		
		System.out.println(n1 + "x" + n2 + "=" + n1*n2 );
		sc.close();
	}

}
