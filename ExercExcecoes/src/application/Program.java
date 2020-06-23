package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		Account account = new Account(number, name, balance, limit);
		
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		
		try {
		account.withdraw(amount);
		System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		
		}catch (DomainExceptions d) {
			System.out.println(d.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();		
	}
}
