package assignment.oopsconcept.problem4;


public class WaterCarrier {
	protected String carrierName;
	protected String carrierCode;
	protected String carrierType;
	protected String iataCode;
	protected String carrierAddress;
	
	public WaterCarrier(){
		
	}
	
	public WaterCarrier(String carrierName, String carrierCode, String iataCode, String carrierAddress,String carrierType) {
		super();
		this.carrierName = carrierName;
		this.carrierCode = carrierCode;
		this.iataCode = iataCode;
		this.carrierAddress = carrierAddress;
		this.carrierType = carrierType;
	}

	public String getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}

	public String getCarrierAddress() {
		return carrierAddress;
	}

	public void setCarrierAddress(String carrierAddress) {
		this.carrierAddress = carrierAddress;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	
	//fill the code
}
