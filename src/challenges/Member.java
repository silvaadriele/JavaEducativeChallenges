package challenges;

public class Member {
	protected OverdueFee amountOverdue;
	
	public double getAmountOverDue() {
		if (amountOverdue.discountPercentage==0)
			return amountOverdue.amount;
		return this.amountOverdue.amount= amountOverdue.amount - (amountOverdue.discountPercentage
				/100 *amountOverdue.amount);
	}
	
	public void setAmountOverDue(double amount, double discountPercentage) {
		this.amountOverdue.amount=amount;
		this.amountOverdue.discountPercentage=discountPercentage;
	}
}

class OverdueFee{
	protected double discountPercentage;
	protected double amount;
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}


