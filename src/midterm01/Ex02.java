package midterm01;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		System.out.println("정숫값 : (사용자 입력)");
		value = scanner.nextInt();
		
		if (value == 0) { // 0 확인
			System.out.println(value + "입니다");
		} else if ((value < 10 && value > 0) || (value > -10 && value < 0)) { // 1자리수 확인
			System.out.println("정숫값 : " + value + "\n1자리 입니다");
		} else if ((value >= 10 && value < 100) || (value <= -10 && value > -100)) { // 2자리수 확인
			System.out.println("정숫값 : " + value + "\n2자리 입니다");
		} else { // 3자리 이상
			System.out.println("3자릿수 이상입니다.");
		}
	}
}