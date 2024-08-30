package ch07.airplane;

public class SonicAsiana extends SupersonicAirplane{
	
	private final static String MEALOK = "식사가 가능합니다";
	private final static String MEALNOK = "식사가 안됩니다";
	
	// 상태 필드 선언
	public String mealTime = MEALNOK;
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			if (mealTime == MEALNOK) {
				System.out.println("지금은 식사를 할 수 없습니다");
			} else {
				System.out.println("식사를 준비 하겠습니다");
			}
		}
	}
}
