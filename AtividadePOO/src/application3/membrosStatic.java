package application3;

import java.util.Locale;
import java.util.Scanner;

import entities3.currencyConverter;

public class membrosStatic {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dólar? ");
		double dolar  = sc.nextDouble();
		System.out.println("quantos dólares serão comprados: ");
		double compraDolares= sc.nextDouble();
		double resultado = currencyConverter.converterMoeda(dolar, compraDolares);
		System.out.printf("valor a ser pago em reais = %.2f",resultado);
		
		sc.close();
		
	}

}
