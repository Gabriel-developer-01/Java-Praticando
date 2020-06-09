package application1;


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] matr = new int[M][N];
		
		for(int i = 0; i < matr.length; i++) {
			for(int k = 0; k < matr[i].length; k++) {
				matr[i][k] = sc.nextInt();
			}
		}
		
		int X = sc.nextInt();
		
		for(int i = 0; i < matr.length; i++) {
			for(int k = 0; k < matr[i].length; k++) {
				if(matr[i][k] == X) {
					System.out.println("Position "+ i + "," + k + ":");
					if(k > 0) {
						System.out.println("Left: "+matr[i][k-1]);
					}
					if(i > 0) {
						System.out.println("UP: "+matr[i-1][k]);	
					}
					if(k < matr[i].length-1) {
						System.out.println("Right: "+matr[i][k+1]);
					}
					if(i < matr.length-1) {
						System.out.println("Down: "+matr[i+1][k]);
					}
				}
			
			}
		}
		
		sc.close();

	}

}
