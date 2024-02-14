import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//22. Escreva um programa Java para inserir uma palavra no meio de outra string.
		
		System.out.println("Escreva uma frase:");
		String frase = sc.nextLine();
		
		System.out.println("Escreva uma palavra:");
		String palavra = sc.next();		
		
		// Encontrar o ponto médio da frase
        int meio = frase.length() / 2;
        
        // Inserir a palavra no meio da frase
        String novaFrase = frase.substring(0, meio) + " " + palavra + frase.substring(meio);
        
        System.out.println("Frase com a palavra inserida no meio: " + novaFrase);
		
		
		
		
		sc.close();

	}

}
