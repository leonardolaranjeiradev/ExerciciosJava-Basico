import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16 {

	public static void main(String[] args) {
		//16. Escreva um programa Java para exibir a data e hora atual em um formato específico.

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date now = new Date();

		String formattedDateTime = sdf.format(now);
		System.out.println("Data e Hora Atuais: " + formattedDateTime);

	}

}
