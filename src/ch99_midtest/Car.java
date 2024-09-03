package ch99_midtest;

public class Car {
	
	String name;
	int width;
	int height;
	int length;
	
	public Car(String name, int width, int height, int length) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	void putSpec() {
		System.out.println("이름 : " + name);
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("길이 : " + length);
		}
}