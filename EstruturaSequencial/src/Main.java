import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double resT,resC,resTr,resQ,resR, pi = 3.14159;
		
		
		System.out.printf("Digite o valor de A: ");
		double A = sc.nextDouble();
		System.out.printf("Digite o valor de B: ");
		double B = sc.nextDouble();
		System.out.printf("Digite o valor da Altura: ");
		double C = sc.nextDouble();
		
		resT = A * C/2;
		System.out.printf("TRIANGULO: %.3f%n",resT);
		
		resC = pi * C * C;
		System.out.printf("CIRCULO: %.3f%n",resC);
		
		resTr = (A+B)/2*C;
		System.out.printf("TRAPEZIO:: %.3f%n",resTr);
		resQ = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f%n",resQ);
		resR = A*B;
		System.out.printf("RETANGULO: %.3f",resR);
		
	}
	
}