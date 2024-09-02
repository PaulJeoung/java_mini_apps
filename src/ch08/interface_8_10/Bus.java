package ch08.interface_8_10;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다 ~");
	}
	
	public void checkFare() {
		System.out.println("승차 요금을 확인 합니다 [[[::]]]");
	}
}
