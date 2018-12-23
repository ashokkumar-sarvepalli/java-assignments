package assignment.objectaccessencapsulationstatic.problem2;


public class Company {
	private String identifier;
	private String iata;
	private String fmc;
	private Address address;
	public Company(){}
	public Company(String identifier, String iata, String fmc, Address address) {
		this.identifier = identifier;
		this.iata = iata;
		this.fmc = fmc;
		this.address = address;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getFmc() {
		return fmc;
	}
	public void setFmc(String fmc) {
		this.fmc = fmc;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString() {
		// fill the code
		return null;
	}
}