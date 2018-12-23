package assignment.objectaccessencapsulationstatic.problem1;

public class Shipment {

	private int id;
	private String shipperName;
	private String modeofTransportation;
	private float totalWeight;
	private String arrivalPort;
	private String departurePort;
	static int nextShipmentid = 1000;

	

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-25s%-20s%-20s%-15s", this.id, this.shipperName, this.modeofTransportation,
				this.totalWeight + "Kg", this.arrivalPort, this.departurePort);
	}

	

	

}