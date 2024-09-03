package ch09.nested_07;

public class HomeSystemApp {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.use1();
		home.use2();
		home.user3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("TURN ON THE RADIATOR");
			}
			@Override
			public void turnOff() {
				System.out.println("TURN OFF THE RADIATOR");
			}
		});
	}
}
