package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		double min = 1000.00;
		list.removeIf(x -> x.getPrice() >= min);
		
		for(Product p : list) {
			System.out.println(p);
		}

	}
}