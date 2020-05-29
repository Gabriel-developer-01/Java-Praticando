import java.util.Locale;
import java.util.Scanner;

public class enquanto2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int somaAL=0, somaGA=0, somaDI=0;

		System.out.printf("Digite 1 - Álcool%nDigite 2 - Gasolina%nDigite 3 - Diesel%n4- Sair%nSolicite a operação: ");
		int x = sc.nextInt();
		
		while (x != 4) {

			switch (x) {

			case 1:
				somaAL += 1;
				break;
			case 2:
				somaGA += 1;
				break;
			case 3:
				somaDI += 1;
				break;	
				
			}
			System.out.printf("Digite 1 - Álcool%nDigite 2 - Gasolina%nDigite 3 - Diesel%n4- Sair%nSolicite a operação: ");
			 x = sc.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: "+somaAL);
		System.out.println("Gasolina: "+somaGA);
		System.out.println("Diesel: "+somaDI);
		
		sc.close();

	}

}
