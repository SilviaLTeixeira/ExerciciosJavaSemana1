package exerciciosemana1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skate {

	public static void main(String[] args) {
		int qteNumerosDigitados;
		double maior = -1;
		double menor = 11;
		double maiorIndex =-1;
		double menorIndex =-1;
		double mediaScore = 0;
		double arrayValores[];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas:");
		qteNumerosDigitados = entrada.nextInt();
		arrayValores = new double[qteNumerosDigitados];
		for(int i = 0; i < qteNumerosDigitados;i++) {
			System.out.println("\n Informe a nota "+(i+1));
			arrayValores[i] = entrada.nextDouble();
			//maior = arrayValores[i];
			//menor = arrayValores[i];
		}
		for(int i = 0; i < arrayValores.length;i++) {
			if(arrayValores[i] > maior) {
				maior = arrayValores[i];
				maiorIndex = i;
			} if(arrayValores[i]<menor) {
				menor = arrayValores[i];
				menorIndex = i;
			}
		}
		System.out.println("A maior nota é :"+maior+"A menor nota é: "+menor);
		List<Double> score = new ArrayList<Double>();
		for(int i = 0; i < qteNumerosDigitados;i++) {
			if(i== maiorIndex||i==menorIndex) {
				continue;
			}
			score.add(arrayValores[i]);
			mediaScore += arrayValores[i];
		}
		 mediaScore = (mediaScore)/score.size();
		 System.out.printf("Scores contados: %s%n",score); 
		 System.out.printf("Media das notas: %.2f%n", mediaScore);

	}

}
