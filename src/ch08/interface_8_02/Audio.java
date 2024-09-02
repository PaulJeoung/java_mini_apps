package ch08.interface_8_02;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TURN ON THE AUDIO");
	}
}
