package assignment.collections.problem1;

class Commodity{

private String commodityName;
private String quantity;
private String totalvalue;
private String totalWeight;
private String hazardous;

Commodity(){}


Commodity(String commodityName,String quantity,String totalvalue,String totalWeight,String hazardous){
super();
this.commodityName=commodityName;
this.quantity=quantity;
this.totalvalue=totalvalue;
this.totalWeight=totalWeight;
this.hazardous=hazardous;
}

public String getCommodityName() {
    	return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}


public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

public String getTotalvalue() {
		return totalvalue;
	}

	public void setTotalvalue(String totalvalue) {
		this.totalvalue = totalvalue;
	}

public String getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(String totalWeight) {
		this.totalWeight = totalWeight;
	}
public String getHazardous() {
		return hazardous;
	}

	public void setHazardous(String hazardous) {
		this.hazardous = hazardous;
	}

public String toString(){
   
	     return null;
	   }
}
