package assignment.oopsconcept.problem5;


public class Company implements MenuDrivenEntity,TaxPayer {
	private String id;
	private Double expense;
	private Double profit;
	public Company(){
	}
	public Company(String values) {
		//fill the code
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getExpense() {
		return expense;
	}
	public void setExpense(Double expense) {
		this.expense = expense;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	@Override
	public Double calculateRevenue() {
		//fill the code
		
		return 0.0;
	}
	@Override
	public Double calculateTax() {
		//fill the code
		
		return 0.0;
	}
	@Override
	public void displayMenu() {
		//fill the code
	}
	@Override
	public void choiceAction(int choice) {
		//fill the code
	}
}