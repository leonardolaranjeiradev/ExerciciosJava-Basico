import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 17. Escreva um programa Java para converter segundos em horas, minutos e
		// segundos.

		System.out.println("Entre com os Segundos:");
		int totalSegundos = sc.nextInt();

		int hora = totalSegundos / 3600;
		int segundosRestantes = totalSegundos % 3600;
		int minutos = segundosRestantes / 60;
		int segundos = segundosRestantes % 60;

		System.out.println(hora + ":" + minutos + ":" + segundos);
		sc.close();
	}

}
