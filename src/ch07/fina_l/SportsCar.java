package ch07.fina_l;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("스포츠카는 시속 " + speed + "km/h !!!");
	}
	
//	@Override
//	public void stop() { // Car class에서 stop() 메서드가 final이어서 재정의가 불가 함
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
