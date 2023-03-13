package oops;

class TollBooth {
	private int noOfVehicles;
	private double amountCollected;
	
	TollBooth() {
		this.noOfVehicles = 0;
		this.amountCollected = 0;
	}
	
	void payingVehicle() {
		this.noOfVehicles++;
		this.amountCollected += 0.50;
	}
	
	void nonPayingVehicle() {
		this.noOfVehicles++;
	}
	
	void display() {
		System.out.println("No of Vehicles " + this.noOfVehicles);
		System.out.println("Amount Collected: " + this.amountCollected);
	}
}

public class OOPS3 {

	public static void main(String[] args) {
		TollBooth toll = new TollBooth();
		toll.payingVehicle();
		toll.payingVehicle();
		toll.nonPayingVehicle();
		toll.display();
	}

}
