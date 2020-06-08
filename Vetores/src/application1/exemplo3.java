package application1;

import java.util.Locale;
import java.util.Scanner;

import entities3.Registro;

public class exemplo3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		Registro[] vect = new Registro[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Aluguel #" + (i + 1) + ":");

			System.out.printf("Name: ");
			String nome = sc.nextLine();

			System.out.printf("Email: ");
			String email = sc.nextLine();

			System.out.printf("Quarto: ");
			int nroQuarto = sc.nextInt();
			vect[i] = new Registro(nome, email, nroQuarto);
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < n; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getNroQuarto() + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}

		sc.close();
	}

}
