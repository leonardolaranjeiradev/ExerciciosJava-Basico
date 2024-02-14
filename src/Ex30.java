import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		//30. Escreva um programa Java que leia um número em polegadas e o converta em metros.
		Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor para polegada: ");
        double polegadas = sc.nextDouble();
        double metros = polegadas * 0.0254;
        System.out.println(polegadas + " polegada é " + metros + " metros ");
        
        sc.close();


	}

}
