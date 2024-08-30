package ch07.fina_l;

public class Car {
	// 필드 선언
	public int speed;
	
	// 메서드 선언
	public void speedUp() {
		speed += 1;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	// final 메서드 선언
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
