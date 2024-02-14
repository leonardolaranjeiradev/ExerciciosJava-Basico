
public class Ex13 {
	public static void main(String[] args) {

		// 13. Escreva um programa Java para verificar se o Java está instalado em seu
		// computador

		System.out.println("\nVersao do Java: " + System.getProperty("java.version"));
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");

	}

}
