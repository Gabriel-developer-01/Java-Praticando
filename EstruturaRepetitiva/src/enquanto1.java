import java.util.Locale;
import java.util.Scanner;

public class enquanto1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor da coordernada x: ");
		int x = ler.nextInt();
		System.out.print("Digite o valor da coordernada y: ");
		int y = ler.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("1° Quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("2° Quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("3° Quadrante");
			}
			else {
				System.out.println("4° Quadrante");
			}
			System.out.print("Digite o valor da coordernada x: ");
			x = ler.nextInt();
			System.out.print("Digite o valor da coordernada y: ");
			y = ler.nextInt();
		}
			System.out.print("Uma das coordernadas foi nula,o programa será finalizado!");
			ler.close();
	}

}
