package application;

import java.util.Locale;
import java.util.Scanner;

import entities2.Product;

public class exemplo2 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Product(nome,preco);
		}
		double sum = 0.0;
		for(int i=0; i < vect.length; i++) {
			sum += vect[i].getPreco();
		}
		
		double media = sum/vect.length;
		System.out.printf("A media dos preço: %.2f",media);
		
		sc.close();
	}

}
