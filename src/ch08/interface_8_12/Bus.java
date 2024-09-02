package ch08.interface_8_12;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("부우우웅~~ 버스");
	}
	
	public void checkFare() {
		System.out.println("삐삑!!~ 승차 요금을 확인 합니다");
	}
}
