package entities;

public final class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}	

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double deduct = healthExpenditures * 0.5;
		if(super.getAnnualIncome() < 20000.00) {
			return super.getAnnualIncome() * 0.15 - deduct;
		} else {
			return super.getAnnualIncome() * 0.25 - deduct;
		}	
	}
	
}