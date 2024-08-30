package ch07.override;

public class Computer extends Calculator{
	// 메소드 오버라이딩 (컴파일 시에 에러를 확인 해줌)
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer object operates the areaCircle() function");
		return Math.PI * r *r;
	}
}
