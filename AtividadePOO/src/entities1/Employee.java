package entities1;

public class Employee {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double SalarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void AumentarSalario(double porcentagem) {
		salarioBruto += (salarioBruto * porcentagem)/100;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", SalarioLiquido());
	}
	
}
