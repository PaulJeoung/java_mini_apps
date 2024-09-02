package ch08.interface_8_06;

public interface RemoteControl {
	// public static final 키워드 생략 하고 int로 바로 사용 가능함 (생략 해도 컴파일러에서 자동 처리)
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	// default 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("SOUND SET A MUTE");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("MUTE SET A CLEAR");
		}
	}
	// 정적 메서드
	static void changeBattery() {
		System.out.println("REMOTE CONTROLLER BATTERY CHANGE NOW +(___)");
	}
	
}
