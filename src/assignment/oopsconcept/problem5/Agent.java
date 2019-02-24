package assignment.oopsconcept.problem5;


public class Agent implements MenuDrivenEntity,TaxPayer {
	private String id;
	private Double expense;
	private Double commision;
	public Agent(){
	}
	public Agent(String values) {
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
	public Double getCommision() {
		return commision;
	}
	public void setCommision(Double commision) {
		this.commision = commision;
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