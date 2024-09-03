package ch09.Nested_05;

public class NestA {
	String fieldA = "A-field 입니다";
	
	void method() {
		System.out.println("A-METHOD <<---- ");
	}
	
	class NestB {
		String fieldB = "B-FIELD IS IT!!";
		
		void method() {
			System.out.println("IN B-FIELD, B-METHOD <<---- ");
		}
		void print() {
			System.out.println(this.fieldB);
			this.method();
			
			System.out.println(NestA.this.fieldA);
			NestA.this.method();
		}
	}
	void usbB() {
		NestB nestB = new NestB();
		nestB.print();
	}
}
