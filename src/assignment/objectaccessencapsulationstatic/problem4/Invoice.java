package assignment.objectaccessencapsulationstatic.problem4;


public class Invoice {
	private User customer;
	private Double total;
	private String status;
	private String createdBy;
	
	public Invoice(User customer, Double total, String status, String createdBy) {
		super();
		this.customer = customer;
		this.total = total;
		this.status = status;
		this.createdBy = createdBy;
	}
	
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
