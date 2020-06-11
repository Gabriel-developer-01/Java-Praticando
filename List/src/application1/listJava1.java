package application1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class listJava1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			sc.nextLine();
			System.out.println("Funcion�rio #" + i + ":");
			
			System.out.print("ID: ");
			int id = sc.nextInt();	
			while(temId(list, id)) {
				System.out.print("Esse ID j� existe,tente outro ID: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();
			System.out.println();
			
			funcionario fun = new funcionario(id, nome, salario);
			list.add(fun);
		}
		
		System.out.println();
		System.out.print("Digite o ID do funcion�rio que ter� aumento salarial: ");
		int id = sc.nextInt();
		funcionario  fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(fun == null) {
			System.out.println("Este ID n�o existe");
		
		}else {
			System.out.print("Digite o valor da porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			fun.aumentarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcion�rios:");
		for(funcionario obj : list) {
			System.out.println(obj);
		}
		
		
		sc.close();
	}
	public static boolean temId(List<funcionario> list, int id) {
		funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return fun != null;
	}
}