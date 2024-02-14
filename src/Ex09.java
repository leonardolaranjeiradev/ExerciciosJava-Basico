import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// 9. Escreva um programa Java para imprimir a área e o perímetro de um círculo
		// Em geometria, a área delimitada por um círculo de raio r é πr2.
		// Aqui a letra grega π representa uma constante, aproximadamente igual a
		// 3,14159,
		// que é igual à razão entre a circunferência de qualquer círculo e seu
		// diâmetro.
		// A circunferência de um círculo é a distância linear em torno de sua borda.

		double raio = 7.5;
		double perimetroCirculo = 2.0 * Math.PI * raio;
		double areaCirculo = Math.PI * raio * raio;

		System.out.printf("Perimetro: %.2f%n", perimetroCirculo);
		System.out.printf("Area: %.2f%n", areaCirculo);

		sc.close();
	}

}
