package ch08.interface_8_11;

public class CarApp {

	public static void main(String[] args) {
		
		Car camry = new Car();
		camry.run();
		
		System.out.println();
		
		camry.tire1 = new KumhoTire();
		camry.tire2 = new KumhoTire();
		
		camry.run();
		
	}

}
