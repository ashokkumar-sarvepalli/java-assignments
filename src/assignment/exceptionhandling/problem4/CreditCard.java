package assignment.exceptionhandling.problem4;

public class CreditCard {
	private String cardNumber;
	private Double cardLimit;
	
	public CreditCard(String cardNumber, Double cardLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Double getCardLimit() {
		return cardLimit;
	}

	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}
}
