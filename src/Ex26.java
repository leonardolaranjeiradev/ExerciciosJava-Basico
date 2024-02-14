
public class Ex26 {

	public static void main(String[] args) {
		//26. Escreva um programa Java para obter o valor da variável de ambiente PATH, TEMP, USERNAME.
		  // obtém o valor da variável de ambiente especificada "PATH"
	      System.out.println("\nVariável de ambiente PATH: ");
	      System.out.println(System.getenv("PATH"));

	      // obtém o valor da variável de ambiente especificada "TEMP"
	      System.out.println("\nVariável de ambiente TEMP: ");
	      System.out.println(System.getenv("TEMP"));

	      // obtém o valor da variável de ambiente especificada "USERNAME"
	      System.out.println("\nVariavel de ambiente USERNAME: ");
	      System.out.println(System.getenv("USERNAME"));

	}

}
