package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecoes {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("*** METHOD2 START ***");
		method2();
		System.out.println("*** METHOD2 END ***");
	}
	
	
	public static void method2() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("*** METHOD2 START ***");
			String[] vect = entrada.nextLine().split(" ");
			int position = entrada.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			entrada.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}

		entrada.close();
		System.out.println("*** METHOD2 START ***");
	}
}
