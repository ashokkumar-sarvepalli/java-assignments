package assignment.oopsconcept.problem5;


public class Carrier implements ICarrier, MenuDrivenEntity {
	private String id;
	private Double expense;
	private String modeOfTransport;
	private String[] listOfPorts;
	public Carrier(){}
	public Carrier(String values) {
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
	public String getModeOfTransport() {
		return modeOfTransport;
	}
	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}
	@Override
	public void listPorts() {
		//fill the code
	}
	@Override
	public void noOfPort() {
		//fill the code
	}
	public void displayMenu() {
		//fill the code
	}
	@Override
	public void choiceAction(int choice) {
		//fill the code
	}
}