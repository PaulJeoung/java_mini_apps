package ch08.interface_8_05;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("SOUND SET A MUTE");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("MUTE SET A CLEAR");
		}
	}
}
