package ch98.no2;

import java.util.Scanner;

public class TestEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int absValue;
		
		System.out.println("숫자를 입력 해주세요");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		absValue = Math.abs(number);
		if (number==0) {
			System.out.println("0입니다");
		} else if (absValue < 10) {
			System.out.println("한자리수 입니다 | 입력값 : " + number);
		} else if (absValue >= 10) {
			if (absValue < 100) {
				System.out.println("두자리수 입니다 | 입력값 : " + number);
			} else {
				System.out.println("두자리수가 넘는 숫자 입니다 | 입력값 : " + number);
			}
		} 
		

	}

}
