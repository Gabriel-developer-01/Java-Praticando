package application1;

import java.util.Locale;
import java.util.Scanner;

import entities1.Employee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextInt();
		
		System.out.println("Funcion�rio: " + funcionario.nome + ", $" + funcionario.SalarioLiquido());
		System.out.print("Qual porcentagem para aumentar o sal�rio? ");
		double porc = sc.nextDouble();
		funcionario.AumentarSalario(porc);
		System.out.println("Dados atualizados: "+funcionario);
		
		sc.close();

	}

}
