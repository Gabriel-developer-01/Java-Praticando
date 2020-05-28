import java.util.Locale;
import java.util.Scanner;

public class ifElse {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total;
		
		System.out.println("Digite o código do item que deseja: ");
		int cod = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		int qtd = sc.nextInt();
		if (cod == 1) {
			total = 4.00 * qtd;
			System.out.print("Total: R$ "+total);
		}else if (cod == 2) {
			total = 4.50 * qtd;
			System.out.print("Total: R$ "+total);
		}else if (cod == 3) {
			total = 5.00 * qtd;
			System.out.print("Total: R$ "+total);
		}else if (cod == 4) {
			total = 2.00 * qtd;
			System.out.print("Total: R$ "+total);
		}else {
			total = 1.50 * qtd;
			System.out.print("Total: R$ "+total);
		}
		sc.close();
	}

}
