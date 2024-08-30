package ch07.type_change;

public class ChildRunner {

	public static void main(String[] args) {
		// ---------- 자동 형 변환 ------------
		
//		// 자식 객체 생성
//		Child fatherChild = new Child();
//		
//		// 자동 타입 변환
//		Parent granMom = fatherChild;
//		
//		// 메소드 호출
//		granMom.method1();
//		granMom.method2();
//		// granMom.method3(); // 호출 불가
		
		// ---------- 강제 형 변환 ------------
		
		// 객체 생성 및 자동 타입 변환
		Parent granFa = new Child();
		
		// Parent 타입으로 필드와 메소드 사용
		granFa.fieldParent = "data1";
		granFa.method1();
		granFa.method2();
		/*
		 * granFa.fieldChild = "data2"; // 불가
		 * granFa.method3();
		 */
		
		// 강제 타입 변환
		Child child = (Child) granFa;
		
		// child 타입으로 필드와 메소드 사용
		child.fieldChild = "data2";
		child.method3();

	}

}
