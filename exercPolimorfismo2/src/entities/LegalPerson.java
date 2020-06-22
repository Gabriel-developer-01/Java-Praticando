package entities;

public  class LegalPerson extends CommonPerson {
	
	private Integer employees;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}
	
	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double calculation() {
		double total = 0;
		if(employees >= 10) {
			total =	getAnnualIncome() * 0.14;
		}else {
			total =	getAnnualIncome() * 0.16;
		}
		return total;
	}
}
