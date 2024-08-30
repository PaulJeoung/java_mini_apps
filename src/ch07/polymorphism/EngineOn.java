package ch07.polymorphism;

public class EngineOn {

	public static void main(String[] args) {
		Car ponyCar = new Car();
		
		ponyCar.tire = new Tire();
		ponyCar.run();
		
		ponyCar.tire = new HankookTire();
		ponyCar.run();
		
		ponyCar.tire = new KumhoTire();
		ponyCar.run();

	}

}
