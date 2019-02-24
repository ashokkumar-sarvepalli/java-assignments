package assignment.exceptionhandling.problem1;

import java.text.*;
public class Container {
    
	private String number;
	private float containerWeight;
	private Commodity[] commidities;
	DecimalFormat df = new DecimalFormat("#.##");
	
	public Container(String number, float containerWeight, Commodity[] commidities) {
		super();
		this.number = number;
		this.containerWeight = containerWeight;
		this.commidities = commidities;
	}
	
	public float getContainerWeight() {
		return containerWeight;
	}

	public void setContainerWeight(float containerWeight) {
		this.containerWeight = containerWeight;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Commodity[] getCommidities() {
		return commidities;
	}

	public void setCommidities(Commodity[] commidities) {
		this.commidities = commidities;
	}
	
	void displayDetails(){
       		System.out.println("Commodity details are");
		System.out.format("%-15s%-15s%s\n", "Id","Weight","Quantity");
		//fill code here
	}
}
