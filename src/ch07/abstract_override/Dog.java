package ch07.abstract_override;

public class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
