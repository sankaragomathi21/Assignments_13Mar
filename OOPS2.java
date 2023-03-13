package oops;

class CashRegister {
	private int cashOnHand;
	
	CashRegister(int cash) {
		this.cashOnHand = cash;
	}
	
	int getCurrentBalance() {
		return this.cashOnHand;
	}
	
	void acceptAmount(int cash) {
		this.cashOnHand += cash;
	}
}

public class OOPS2 {

	public static void main(String[] args) {
		
	}

}
