package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome e as notas: ");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n",aluno.media());
		System.out.printf(aluno.StatusSemestre());
		sc.close();
	}

}
