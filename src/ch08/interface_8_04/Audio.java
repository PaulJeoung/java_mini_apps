package ch08.interface_8_04;

public class Audio implements RemoteControl {
private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TURN ON THE AUDIO");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TURN OFF THE AUDIO");
	}
	
	@Override
	public void setVolume (int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("NOW AUDIO VOLUME : " + this.volume);
	}
}
