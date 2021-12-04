package exerciciosemana1;

import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Jogador1 = 0;
		int Jogador2 = 0;
		String movimentos;
		System.out.println("---JOKENPO----- ");
		loop:
		while(true) {
			System.out.println("Informe a sua jogada sendo R pedra , P papel e S tesoura: ");
			movimentos = entrada.nextLine();
			switch(movimentos) {
			case"":break loop;
			case "R R":break;
			case "P P": break;
			case "S S": break;
			case "R S":{
				Jogador1++;
				break;
			}
            case "P R": {
                Jogador1++;
                break;
            }
            case "S P": {
                Jogador1++;
                break;
            }
            case "S R": {
                Jogador2++;
                break;
            }
            case "R P": {
                Jogador2++;
                break;
            }
            case "P S": {
                Jogador2++;
                break;
            }
            default: {
                System.out.println("Insira movimentos validos");
            }
		}
	}
		System.out.println("-----------------------------");
		System.out.printf("Player A    %d x %d    Player B", Jogador1, Jogador2);
		entrada.close();
}
}

	


