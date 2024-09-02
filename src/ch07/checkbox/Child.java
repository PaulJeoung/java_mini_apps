package ch07.checkbox;

public class Child extends Parent {
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("ADD SYSTEM INITIALIZE");
	}
}
