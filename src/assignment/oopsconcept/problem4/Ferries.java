package assignment.oopsconcept.problem4;

public class Ferries extends WaterCarrier{
	Integer maxLoad;

	public Ferries(){
		
	}
	
	public Ferries(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer maxLoad) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.maxLoad = maxLoad;
	}

	public Integer getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}

	//fill the code
}
