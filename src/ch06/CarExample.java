package ch06;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		// Car 객체의 필드값 읽기
		System.out.println("Manufacture   : " + myCar.company);
		System.out.println("Model Name    : " + myCar.model);
		System.out.println("Model Color   : " + myCar.color);
//		System.out.println("Engine Status : " + myCar.start);
		System.out.println("Current Speed : " + myCar.maxSpeed);
		System.out.println("Max Speed     : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("New Current Speed : " + myCar.speed);

	}

}
