package ch06.car.speed.km.mile;

public class CarRunner {

	public static void main(String[] args) {
		CarSpeed myCarSpeed = new CarSpeed();
		
		myCarSpeed.setSpeed(-50);
		System.out.println("Now Speed : " + myCarSpeed.getSpeed());
		
		myCarSpeed.setSpeed(60);
		System.out.println("Now Speed  : " + myCarSpeed.getSpeed());
		
		if(!myCarSpeed.isStop()) { 
			myCarSpeed.setStop(true);
		}
		System.out.println("Now Speed : " + myCarSpeed.getSpeed());
	}

}
