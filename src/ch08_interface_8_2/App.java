package ch08_interface_8_2;

public class App {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		
		rc = new Audio();
		rc.turnOn();
	}

}
