package ch08.interface_8_06;

public class Television implements RemoteControl{
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TURN ON THE TELEVISION");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TURN OFF THE TELEVISION");
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
		System.out.println("NOW TELEVISION VOLUME : " + this.volume);
	}

}
