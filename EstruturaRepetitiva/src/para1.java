import java.util.Locale;
import java.util.Scanner;

public class para1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas vezes deseja calcular a média: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Digite o 1° valor: ");
			double a = sc.nextDouble();
			System.out.printf("Digite o 2° valor: ");
			double b = sc.nextDouble();
			System.out.printf("Digite o 3° valor: ");
			double c = sc.nextDouble();
			
			double media = (a*2 + b*3 + c*5)/10.0;
			System.out.printf("Média: %.1f%n", media);
		}
		
		sc.close();

	}

}
