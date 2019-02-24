package assignment.exceptionhandling.problem1;
public class Commodity {
    
	private String commodityId;
	private float totalWeight;
	private int quantity;
	
	public Commodity(String commodityId, float totalWeight, int quantity) {
		super();
		this.commodityId = commodityId;
		this.totalWeight = totalWeight;
		this.quantity = quantity;
	}

	public String getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
