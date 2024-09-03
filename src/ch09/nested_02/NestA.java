package ch09.nested_02;

public class NestA {
	class NestB {
		
		int field1 = 1;
		static int field2 = 2;
		
		NestB() {
			System.out.println("B 생성자 실행");
		}
		
		void method1() {
			System.out.println("B 메소드1 실행");
		}
		
		static void method2() {
			System.out.println("B 메소드2 실행");
		}
		
	}
	void useB() {
		NestB b = new NestB();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(NestB.field2);
		NestB.method2();
	}


}
