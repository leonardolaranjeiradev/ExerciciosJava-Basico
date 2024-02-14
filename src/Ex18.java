import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//18. Escreva um programa Java para converter uma determinada string em minúsculas.
	       
	    System.out.println("Escreva sua mensagem em MAIÚSCULO:");
	    String string = sc.nextLine();
        String minusculo = string.toLowerCase();         
  
        System.out.println("Sua mensagem em minúsculo: " + minusculo);
        sc.close();
        

	}

}
