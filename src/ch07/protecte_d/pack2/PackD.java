package ch07.protecte_d.pack2;

import ch07.protecte_d.pack1.PackA; // pack1 임포트

public class PackD extends PackA { // PackA 상속 (부모클래스)
	// 생성자 선언
	public PackD() {
		super(); // PackA() 생성자 호출
	}
	// 메소드 선언
	public void method1d() { // packA 필드값 변경
		this.field = "value_packD";
		this.method(); // 메소드 호출
	}
//	public void method2d() { // 직접 객체 생성은 안됨
//		PackA packA = new PackA();
//		packA.field = "value";
//		packA.method();
//	}
}
