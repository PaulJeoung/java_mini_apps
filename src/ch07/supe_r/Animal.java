package ch07.supe_r;

public class Animal {
	// 부모 클래스
	private String name; // 필드 선언
	
	public Animal (String name ) { // 생성자
		this.name = name;
	}
	
	public String getName() { // getter 메서드
		return name;
	}
	
	public void sound() { // 메서드
		System.out.println(name + " is making a sound");
	}
}
