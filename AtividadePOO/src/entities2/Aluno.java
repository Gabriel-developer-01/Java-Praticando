package entities2;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double media() {
		return nota1 + nota2 + nota3;
	}

	public String StatusSemestre() {
	
		if(media() > 60) {
			return "PASS";
		}else {
			double ponto = 60 - media();
			if(media() < 60) {}
			return "FAILED" + "%nMISSING "+ String.format("%.2f",ponto) +" POINTS";
		}
	}
	
}

