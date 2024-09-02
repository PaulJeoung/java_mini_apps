package ch08.interface_8_05;

import javax.lang.model.element.Element;

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
	
	private int memoryVolume;
	
	@Override
	public void setMute(boolean mute) {
		if(mute ) {
			this.memoryVolume = this.volume;
			System.out.println("AUDIO VOLUME SET A MUTE NOW...");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("AUDIO VOLME ROLL-BACK PREVIOUS VOLUME...");
			setVolume(this.memoryVolume);
		}
	} 
}
