package ch07.checkbox;

public class Runner {

	public static void main(String[] args) {
		
		action(new ClassA());
		action(new ClassB());
		action(new ClassC());
		
	}
	
	public static void action (ClassA a) {
		a.method1();
		if(a instanceof ClassC c) {
			c.method2();
		}
	}

}
