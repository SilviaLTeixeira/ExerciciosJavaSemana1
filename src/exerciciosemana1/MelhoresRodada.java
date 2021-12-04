package exerciciosemana1;

import java.util.Scanner;

public class MelhoresRodada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int votos [] = new int [11];
		int totalVotos = 0;
		int escolha = -1;
		do {
			System.out.println("Vote em um jogador (1 ao 11): ");
			try {
				escolha = entrada.nextInt();
				if(escolha<0||escolha>11) {
					System.out.println("Insira uma camisa valida!");
					continue;
				}
				votos[escolha-1]++;
				totalVotos++;
			}catch(Exception e){
				System.out.println("Insira uma camisa valida!");
				entrada.nextLine();
				continue;
			}
		}while(escolha!=0);
		if(totalVotos>0) {
			 System.out.println("Jogador N:\tVotos\tPercentual");
			 System.out.println("--------------------------------------");
			 int maisVotos =0;
			 int maiorNumero = -1;
			 for(int i = 0; i < votos.length; i++) {
				 if(votos[i]!=0) {
					 float percentage = (float)votos[i]*100/totalVotos;
					 System.out.printf("Jogador %d\t%d\t%.2f%%%n", (i+1), votos[i], percentage);
					 if(votos[i]>maisVotos) {
						 maisVotos=votos[i];
						 maiorNumero=i+1;
					 }
				 }
			 }
			 System.out.printf("Player %d is the round best!", maiorNumero);
		}
		
		entrada.close();

	}

}
