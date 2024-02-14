
public class Ex23 {

	public static void main(String[] args) {
		// 23. Escreva um programa Java para criar uma nova string de 4 cópias dos
		// últimos 3 caracteres da string original.

		// Declaração da string original
		String fraseOriginal = "Python 3.0";

		// Obtém os últimos 3 caracteres da frase original, excluindo o ponto decimal
		String ultimosTresCaracteres = fraseOriginal.substring(fraseOriginal.length() - 3, fraseOriginal.length());

		// Imprime os últimos 3 caracteres repetidos 4 vezes, separados por espaços
		System.out.println(ultimosTresCaracteres + " " + ultimosTresCaracteres + " " + ultimosTresCaracteres + " "
				+ ultimosTresCaracteres);

	}

}
