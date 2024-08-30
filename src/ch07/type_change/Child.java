package ch07.type_change;

public class Child extends Parent{
	// 필드 선언
	public String fieldChild;
	
	// 메소드 오버라이딩
	@Override
	public void method2 () {
		System.out.println("아버지-메소드1");
	}
	
	// Child 클래스의 메소드 선언
	public void method3 () {
		System.out.println("아버지-메에쏘오오오드2");
	}
}
