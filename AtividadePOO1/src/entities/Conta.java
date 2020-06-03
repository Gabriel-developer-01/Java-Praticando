package entities;

public class Conta {

	private int nroConta;
	private String nome;
	private double saldo;
	
	public Conta(int nroConta, String nome, double depositoInicial) {
		this.nroConta = nroConta;
		this.nome = nome;
		this.saldo = depositoInicial;
	}

	public Conta(int nroConta, String nome) {
		this.nroConta = nroConta;
		this.nome = nome;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor + 5;
	}
	
	public String toString() {
		return "Conta " + getNroConta() + ", " + "Titular: " + nome + ", " + "Saldo: " + "$"+ String.format("%.2f",saldo);
	}
	// Getters e Settrs

	public int getNroConta() {
		return nroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
