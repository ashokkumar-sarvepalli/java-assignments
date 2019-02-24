package assignment.oopsconcept.problem4;


public class BulkShips extends WaterCarrier{
	Integer noOfcargoes;

	public BulkShips(){
		
	}
	
	public BulkShips(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer noOfcargoes) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfcargoes = noOfcargoes;
	}

	public Integer getNoOfcargoes() {
		return noOfcargoes;
	}

	public void setNoOfcargoes(Integer noOfcargoes) {
		this.noOfcargoes = noOfcargoes;
	}

	//fill the code
}
