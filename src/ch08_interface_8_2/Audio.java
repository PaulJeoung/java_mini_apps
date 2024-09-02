package ch08_interface_8_2;

public class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TURN ON THE AUDIO");
	}
}
