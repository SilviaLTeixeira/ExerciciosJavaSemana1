package exerciciosemana1;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual é o preço do etanol por litro?");
		double etanol = entrada.nextDouble();
		System.out.println(etanol+"reais o litro");
		System.out.println("Qual o preço da gasolina por litro");
		double gasolina = entrada.nextDouble();
		System.out.println(gasolina+"reais o litro");
		System.out.println("Qual o rendimento medio por litro de etanol?");
		double rendimentoEtanol = entrada.nextDouble();
		System.out.println(rendimentoEtanol+"km/l");
		System.out.println("Qual o rendimento medio por litro de gasolina?");
		double rendimentoGasolina = entrada.nextDouble();
		System.out.println(rendimentoGasolina+"km/l");
		System.out.println("Qual a rodagem media do motorista em km?");
		double rodagem = entrada.nextDouble();
		System.out.println(rodagem+"km");
		double custoMedioEtanol = (etanol)/(rendimentoEtanol);
		double custoMedioGasolina=(gasolina)/(rendimentoGasolina);
		System.out.println("O custo medio do etanol é: "+ custoMedioEtanol);
		System.out.println("O custo medio da gasolina é: " + custoMedioGasolina);
		if(custoMedioEtanol>custoMedioGasolina) {
			System.out.println("O combustivel recomendado é a gasolina, voce vai gastar"+(custoMedioGasolina*rodagem));
		}else {
			System.out.println("O combustivel recomendado é o etanol, voce vai gastar"+(custoMedioEtanol*rodagem));
		}
	  
		

	}

}
