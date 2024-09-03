package ch09.nested_04;

public class NestA {
	
	public void method1(int arg) {
		int var = 1;
		
		class NestB {
			void method2() {
				System.out.println("arg : " + arg);
				System.out.println("var : " + var);
			}
		}
		
		NestB nestB = new NestB();
		nestB.method2();
	}
}
