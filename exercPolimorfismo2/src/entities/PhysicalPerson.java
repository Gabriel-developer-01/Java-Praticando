package entities;

public class PhysicalPerson extends CommonPerson {

	private double healthSpending;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, double annualIncome, double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double calculation() {
		double total = 0;
		if (getAnnualIncome() < 20000.00 && healthSpending > 0) {
			total = (getAnnualIncome() * 0.15) - (healthSpending * 0.5);
		} else if (getAnnualIncome() < 20000.00 && healthSpending == 0) {
			total = (getAnnualIncome() * 0.15);
		} else if (getAnnualIncome() >= 20000.00 && healthSpending > 0) {
			total = (getAnnualIncome() * 0.25) - (healthSpending * 0.5);
		} else {
			total = (getAnnualIncome() * 0.25);
		}
		return total;
	}

}
