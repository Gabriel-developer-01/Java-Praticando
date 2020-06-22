package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CommonPerson;
import entities.LegalPerson;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<CommonPerson> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char esc = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();

			if (esc == 'i') {
				System.out.print("Health expenditures: ");
				Double expenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, income, expenditures));
			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new LegalPerson(name, income, employees));
			}
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (CommonPerson c : list) {
			System.out.println(c);
			sum += c.calculation();
		}

		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f",sum));

		sc.close();
	}

}
