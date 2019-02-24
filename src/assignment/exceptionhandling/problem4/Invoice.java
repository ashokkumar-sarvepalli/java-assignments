package assignment.exceptionhandling.problem4;

public class Invoice {
	private String invoiceNumber;
	private Double totalAmount;
	private Integer attempts;
	
	public Invoice(String invoiceNumber, Double totalAmount, Integer attempts) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.totalAmount = totalAmount;
		this.attempts = attempts;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getAttempts() {
		return attempts;
	}

	public void setAttempts(Integer attempts) {
		this.attempts = attempts;
	}
	
}
