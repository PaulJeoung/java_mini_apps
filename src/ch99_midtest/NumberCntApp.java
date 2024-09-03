package ch99_midtest;

import java.util.Scanner;

public class NumberCntApp {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int value = 0, absValue = 0;
		System.out.println("아무 정수나 입력해 주세요 > ");
		value = scanner.nextInt();
		absValue = Math.abs(value);
		
		if (absValue == 0) {
			System.out.println("0 입니다 | 입력값 : " + value + " | 절대값 : " + absValue);
		} else if (absValue < 10) {
			System.out.println("1자리 숫자 입니다 | 입력값 : " + value + " | 절대값 : " + absValue);
		} else if (absValue > 10 && absValue < 100) {
			System.out.println("2자리 숫자 입니다 | 입력값 : " + value + " | 절대값 : " + absValue);
		} else {
			System.out.println("2자리 이상의 숫자 입니다 | 입력값 : " + value + " | 절대값 : " + absValue);
		}
		
	}
}
