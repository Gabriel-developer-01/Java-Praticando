import java.util.Locale;
import java.util.Scanner;

public class enquanto {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a senha: ");
		int senha = sc.nextInt();
		
		while(senha != 2002) {

				System.out.println("Senha inválida!");
		
			System.out.printf("Digite a senha: ");
			senha = sc.nextInt();
		}
		
		
			System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
