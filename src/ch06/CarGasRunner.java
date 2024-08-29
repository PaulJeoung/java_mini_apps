package ch06;

public class CarGasRunner {

	public static void main(String[] args) {
		CarGas myFuelStatus = new CarGas();
		
		myFuelStatus.setGas(12); // 현재 연료량
		
		if(myFuelStatus.isLeftGas()) {
			System.out.println("Engine Running...");
			
			myFuelStatus.run();
		}
		System.out.println("FILL IN THE GAS NOW");
	}

}
