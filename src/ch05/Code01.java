package ch05;

public class Code01 {
	// 참조값이 서로 같은 배열을 확인 하는 케이스
	// true, false로 표현
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; // 새로운 객체를 생성 >> 선언한 변수가 새로운 주소값에 저장됨
		arr2 = new int[] {1, 2, 3}; // arr1 과 값은 같지만 서로 다른 객체 개념임
		arr3 = arr2;
		
		System.out.println(arr1 != arr2);
		System.out.println(arr2 == arr3);
	}
}
