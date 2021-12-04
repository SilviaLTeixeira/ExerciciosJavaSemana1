package exerciciosemana1;

import java.util.Scanner;

public class Saude {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu sexo(M ou F)");
		String sexo = entrada.nextLine();
		if(sexo.equals("M")||sexo.equals("F")||sexo.equals("m")||sexo.equals("f")) {
			System.out.println(sexo);
		}else {
			System.out.println("Insira um genero valido");
		}
		System.out.println("Qual o seu peso atual em quilos?");
		double peso = entrada.nextDouble();
		System.out.println(peso+"kg");
		System.out.println("Qual é a sua altura em cm?");
		int altura = entrada.nextInt();
		System.out.println(altura+"cm");
		System.out.println("Qual a sua idade em anos?");
		int idade = entrada.nextInt();
		System.out.println(idade+"anos");
		System.out.println("Quantas horas de atividade fisica por dia voce pratica?");
		int horas = entrada.nextInt();
		System.out.println(horas);
		System.out.println("Quantos quilos voce deseja perder por mes?");
		int quilos = entrada.nextInt();
		if(quilos>3) {
			System.out.println("Perder mais de 3kg no mes é prejudicial a saude");
		}else {
			System.out.println(quilos+"kg");
		}
		if(sexo.equals("M")||sexo.equals("m")) {
			double caloriasPorMes = ((400*horas)+(10*peso)+(6.25*altura)-(5*idade)+5)*30;
			double quilosPerderDia = quilos*7000;
			double calorias=(caloriasPorMes - quilosPerderDia)/30;
			System.out.println("Voce precisa de uma dieta de :"+calorias+"kcal/dia");
			
		}else {
			double caloriasPorMes = ((400*horas)+(10*peso)+(6.25*altura)-(5*idade)-16)*30;
			double quilosPerderDia = quilos*7000;
			double calorias=(caloriasPorMes - quilosPerderDia)/30;
			System.out.println("Voce precisa de uma dieta de :"+calorias+"kcal/dia");
		}
		entrada.close();
	}

}
