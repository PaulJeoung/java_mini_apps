package ch08.interface_8_04;

public class App {

	public static void main(String[] args) {
		int volume1 = (int)((Math.random()*10)+ 1);
		int volume2 = (int)((Math.random()*10)+ 1);
		
		RemoteControl remoteControl;
		
		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume(volume1);
		remoteControl.turnOff();
		
		System.out.println();
		
		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume(volume2);
		remoteControl.turnOff();
	}

}
