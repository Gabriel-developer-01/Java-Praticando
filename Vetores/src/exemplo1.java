import java.util.Locale;
import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];
		double media;

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		media = sum / n;
		System.out.printf("Sua média é: %.2f", media);

		sc.close();

	}

}
