package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Insira dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Pre�o: ");
		double preco = sc.nextDouble();
		Product product = new Product(nome, preco);
				
		product.setNome("Computer");
		System.out.println("Nome atualizado: " + product.getNome());
		product.setPreco(1200);
		System.out.println("Pre�o atualizado: " + product.getPreco());
		
		System.out.println();
		System.out.println("Informa��es do produto: " + product.toString());
		
		System.out.println();
		System.out.print("Digite o n�mero de produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		product.AdicionaProduto(quantidade);
		
		System.out.println("Dados atualizados: " + product.toString());
		

		System.out.println("Digite o n�mero de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		product.RemoverProduto(quantidade);
		
		System.out.printf("Dados atualizados: " + product.toString());
		
		
		
		sc.close();

	}

}
