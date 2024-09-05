package midterm01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int inputLength;
		String userData;
		
		System.out.println("배열의 길이를 정해 주세요");
		System.out.println("요소수 : 3 (사용자 입력)");
		inputLength = scanner.nextInt();
		scanner.nextLine(); // int 버퍼 버리기
		String[] arrayPrint = new String[inputLength]; // 요소수
		
		for (int i=0; i<inputLength; i++) {
			System.out.println("값을 널어 주세요 a["+i+"] = (사용자 입력)");
			userData = scanner.nextLine();
			arrayPrint[i] = userData;
		}
		
		System.out.println("모든 입력이 완료 되었습니다. 값을 출력 합니다. \n");
		for (int i=0; i<arrayPrint.length; i++) {
			System.out.println("a[" + i + "] = " + arrayPrint[i]);
		}
	}
}