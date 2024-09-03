package ch09.nested_07;

public class CarApp {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("ANONYMUS CHILD`s TIRE ROLLING NOW...(OBJ=3)");
			}
		});

	}

}
