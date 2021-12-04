package exerciciosemana1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class semana1 {

	public static void main(String[] args) {
		/*Random random = new Random(); 
		double numeroRealAleatorio_0_a_1 = random.nextDouble();
		System.out.println("Número real aleatório de 0 até 1: " + numeroRealAleatorio_0_a_1);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual o seu sobrenome?");
		String sobrenome = entrada.nextLine();
		System.out.print("Qual o seu nome?");
		String nome = entrada.nextLine();
		Date date = new Date();
		System.out.println("Boa tarde "+ nome + sobrenome+",no momento sao "+date);*/
		Scanner game= new Scanner(System.in);
		System.out.println("Adivinhe qual numero de 1 a 5 estou pensando");
		int numero = game.nextInt();
		Random number = new Random();
		int numeroAleatorio = number.nextInt(5)+ 1;
		if(numero==numeroAleatorio) {
			System.out.println("Voce acertou!!");
		}
		else {
			System.out.println("Voce errou o numero correto era "+numeroAleatorio);
		}
		Date data =  new Date();
		Locale local = new Locale("pt","BR");
		DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy",local);
		System.out.println(formato.format(data));

	}

}
