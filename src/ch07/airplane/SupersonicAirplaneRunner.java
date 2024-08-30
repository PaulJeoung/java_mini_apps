package ch07.airplane;

public class SupersonicAirplaneRunner {

	public static void main(String[] args) {
		SupersonicAirplane ke911 = new SupersonicAirplane();
		ke911.takeoff(); // 부모클래스
		ke911.fly(); // super 부모클래스
		ke911.flyMode = SupersonicAirplane.SUPERSONIC; // @override 영역에서 flyMode 변경
		ke911.fly(); // super 부모클래스
		ke911.flyMode = SupersonicAirplane.NORMAL; // @override 영역에서 flyMode 변경
		ke911.fly(); // super 부모클래스
		ke911.land(); // 부모클래스
		
		SonicAsiana ae999 = new SonicAsiana();
		ae999.takeoff();
		ae999.fly();
		ae999.flyMode = SupersonicAirplane.SUPERSONIC;
		ae999.fly();
		ae999.flyMode = SupersonicAirplane.NORMAL;
		ae999.fly();
		ae999.land();
	}
}
