import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//19. Escreva um programa Java para encontrar a penúltima (penúltima) palavra de uma frase.
		
		System.out.println("Entre com as palavras:");
		String line = sc.nextLine();
		
		String[] palavras = line.split(" ");
		
		System.out.println("A penultima palavra é:" + palavras[palavras.length -2]);
		
		
		
		
		
		
		
		sc.close();
	}

}
