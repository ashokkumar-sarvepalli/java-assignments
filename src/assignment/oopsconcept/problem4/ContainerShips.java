package assignment.oopsconcept.problem4;

public class ContainerShips extends WaterCarrier{
	Integer noOfContainers;

	public ContainerShips(){
		
	}
	
	public ContainerShips(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType, Integer noOfContainers) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfContainers = noOfContainers;
	}

	public Integer getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(Integer noOfContainers) {
		this.noOfContainers = noOfContainers;
	}

	//fill the code
}
