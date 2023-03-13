package function_assignment;

public class cashregister {
	public class cashRegister {
	    private int cashOnHand;

	    public cashRegister() {
	        cashOnHand = 100;
	    }

	    public cashRegister(int amount) {
	        cashOnHand = amount;
	    }

	    public int getCurrentBalance() {
	        return cashOnHand;
	    }

	    public void acceptAmount(int amount) {
	        cashOnHand += amount;
	    }
	}
	
}
