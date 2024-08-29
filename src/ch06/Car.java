package ch06;

public class Car {
	
	String company = "Hyundai";
	String model = "Palisaide";
	String color = "black";
	//	boolean start = true;
	int maxSpeed = 350;
	int speed;
	
	Car() {
		
	}
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
