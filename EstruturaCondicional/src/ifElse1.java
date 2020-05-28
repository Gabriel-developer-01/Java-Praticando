import java.util.Locale;
import java.util.Scanner;

public class ifElse1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		double x = sc.nextDouble();
		System.out.println("Digite o valor de y: ");
		double y = sc.nextDouble();
		
		if(x > 0.0 && y > 0.0) {
			System.out.printf("Q1");
		}else if(x < 0.0 && y > 0.0) {
			System.out.printf("Q2");
		}else if(x < 0.0 && y < 0.0) {
			System.out.printf("Q3");
		}else if(x > 0 && y < 0) {
			System.out.printf("Q4");
		}else if(x == 0 && y == 0){
			System.out.printf("Origem");
		}else if(x == 0.0) {
			System.out.printf("Eixo Y");
		}else if(y == 0.0) {
			System.out.printf("Eixo X");
		}
		else {
			System.out.println("Valor inválido!");
		}
		
		
		sc.close();
	}

}
