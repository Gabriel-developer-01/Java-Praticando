import java.util.Locale;
import java.util.Scanner;

public class para {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = sc.nextInt();
		
		for(int i=1; i < x; i++) {
			if(i%2 != 0) {
			System.out.println(i);
			}
		}
		
		sc.close();
	}

}
