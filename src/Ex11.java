import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// 11. Escreva um programa Java para imprimir a área e o perímetro de um
		// retângulo.
		// Um perímetro é um caminho que circunda uma forma bidimensional. A palavra vem
		// do grego peri (ao redor)
		// e metro (medida). O perímetro pode ser usado para calcular o comprimento da
		// cerca necessária para cercar um quintal ou jardim.
		// Na geometria plana euclidiana, um retângulo é um quadrilátero com quatro
		// ângulos retos.
		// Para encontrar a área de um retângulo, multiplique o comprimento pela
		// largura.
		// Um retângulo com quatro lados de igual comprimento é um quadrado.

		double largura = 5.6;
		double altura = 8.5;

		double perimetroRetangulo = 2 * (altura + largura);
		double areaRetangulo = largura * altura;

		System.out.printf("Perimetro: %.2f%n", perimetroRetangulo);
		System.out.printf("Area: %.2f%n", areaRetangulo);

		sc.close();

	}

}
