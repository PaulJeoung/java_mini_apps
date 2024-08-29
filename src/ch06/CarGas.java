package ch06;

public class CarGas {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("Gas is empty");
			return false;
		}
		System.out.println("Gas fill now");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("Operation Now... [remaining Fuel : " + gas + " L]");
				gas -= 1;
			} else {
				System.out.println("Operation Stop...[remaining Fuel : " + gas + " L]");
				return;
			}
		}
	}
}