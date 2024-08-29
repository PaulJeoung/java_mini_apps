package ch06;

public class CarRunner {

	public static void main(String[] args) {
//		// Car 객체 생성
//		Car myCar = new Car();
//		
//		// Car 객체의 필드값 읽기
//		System.out.println("Manufacture   : " + myCar.company);
//		System.out.println("Model Name    : " + myCar.model);
//		System.out.println("Model Color   : " + myCar.color);
//		// System.out.println("Engine Status : " + myCar.start);
//		System.out.println("Current Speed : " + myCar.maxSpeed);
//		System.out.println("Max Speed     : " + myCar.speed);
//		
//		myCar.speed = 60;
//		System.out.println("New Current Speed : " + myCar.speed);
		
		Car carTom = new Car();
		System.out.println("Tom`s car company : " + carTom.company + "\n");
		
		Car carEric = new Car("자가용");
		System.out.println("Eric`s car company : " + carEric.company);
		System.out.println("Eric`s car model   : " + carEric.model);
		System.out.println("Eric`s car color   : " + carEric.color + "\n");
		
		Car carJane = new Car("택시", "빨강", 200);
		System.out.println("Jane`s car company : " + carJane.company);
		System.out.println("Jane`s car model : " + carJane.model);
		System.out.println("Jane`s car color : " + carJane.color);
		System.out.println("Jane`s car maxSpeed : " + carJane.maxSpeed);

	}

}
