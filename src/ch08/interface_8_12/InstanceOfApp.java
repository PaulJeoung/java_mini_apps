package ch08.interface_8_12;

public class InstanceOfApp {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// 그냥 클래스 호출
		taxi.run();
		bus.checkFare();
		bus.run();
		
		System.out.println();
		
		// 객체 타입 확인 하고 호출
		ride(taxi);
		ride(bus);

	}
	
	public static void ride(Vehicle vehicle) { // ride() 안에 인터페이스 매개 변수 생성
		if (vehicle instanceof Bus bus ) {
			bus.checkFare();
		}
		vehicle.run();
	}

}
