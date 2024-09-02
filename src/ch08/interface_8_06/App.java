package ch08.interface_8_06;

public class App {

	public static void main(String[] args) {
		// int volume = (int)((Math.random()*10)+ 1);
		
		RemoteControl remoteControl;
		
		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume((int)((Math.random()*10)+ 1));
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume((int)((Math.random()*10)+ 1));
		remoteControl.turnOff();
		
		System.out.println();
		
		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume((int)((Math.random()*10)+ 1));
		remoteControl.setMute(true);
		remoteControl.setMute(false);
//		remoteControl.setVolume(volume1);
		remoteControl.turnOff();
	}

}
