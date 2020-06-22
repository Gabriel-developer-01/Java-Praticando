package entities;

public abstract class CommonPerson {

	private String name;
	private double annualIncome;
	
	public CommonPerson() {}

	public CommonPerson(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double calculation();
	
	public String toString() {
		return getName() + ": $ " + String.format("%.2f",calculation()); 
	}
}
