package ch07.supe_r;

public class Dog extends Animal{
	// 자식 클래스
	public Dog(String name) { // 부모 클래스의 생성자 호출
		super(name);
	}
	
	@Override
	public void sound() { // 부모 클래스의 메소드 호출
		super.sound();
		System.out.println(super.getName() + " is barking");
	}
}
