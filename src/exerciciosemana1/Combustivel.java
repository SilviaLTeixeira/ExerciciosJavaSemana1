package exerciciosemana1;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual � o pre�o do etanol por litro?");
		double etanol = entrada.nextDouble();
		System.out.println(etanol+"reais o litro");
		System.out.println("Qual o pre�o da gasolina por litro");
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
		System.out.println("O custo medio do etanol �: "+ custoMedioEtanol);
		System.out.println("O custo medio da gasolina �: " + custoMedioGasolina);
		if(custoMedioEtanol>custoMedioGasolina) {
			System.out.println("O combustivel recomendado � a gasolina, voce vai gastar"+(custoMedioGasolina*rodagem));
		}else {
			System.out.println("O combustivel recomendado � o etanol, voce vai gastar"+(custoMedioEtanol*rodagem));
		}
	  
		

	}

}
