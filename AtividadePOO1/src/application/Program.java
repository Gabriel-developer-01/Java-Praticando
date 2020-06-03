package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o titular da conta:  ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Existe um depósito inicial (s / n)? ");
		char ler = sc.next().charAt(0);
		if (ler == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.print(conta.toString());
		System.out.println();
		
		System.out.println();
		System.out.print("Digite um valor de depósito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("Digite um valor de retirada: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta.toString());

		sc.close();
	}

}
