package ch99_midtest;

public class Car {
	
	private String name;
	private int width;
	private int height;
	private int length;
	
	public Car(String name, int width, int height, int length) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public void putSpec() {
		System.out.println("이름 : " + name);
		System.out.println("너비 : " + width + "mm");
		System.out.println("높이 : " + height + "mm");
		System.out.println("길이 : " + length + "mm");
		}
}