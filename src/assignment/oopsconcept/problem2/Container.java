package assignment.oopsconcept.problem2;

public class Container extends Cargo{
	private String containerNumber;
	Container(){}
	public Container(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public String getContainerNumber() {
		return containerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public void displayContainerDetails() {
		
		System.out.format("%-20s %-15s %-15s %-15s %s\n",getContainerNumber(),getLength(),getWidth(),getHeight(),getWeight());
	}
}
