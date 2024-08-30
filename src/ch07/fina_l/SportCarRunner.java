package ch07.fina_l;

public class SportCarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportsCar morning = new SportsCar();
		
		morning.setSpeed(30);
		System.out.println("미친... 지금 속력은..." + morning.getSpeed() + "km/h");
		morning.speedUp();
		morning.speedUp();
		morning.stop();
		
		
	}

}
