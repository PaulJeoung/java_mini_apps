package ch04;

import java.util.Scanner;

public class Code01 {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("점수를 입력 해 주세요 : ");
		String strX = inputScanner.nextLine();
		int score = Integer.parseInt(strX);
		
		if(score >= 90) {
			System.out.println("점수가 90점 보다 큽니다\n등급은 A 등급 입니다");
		} else if (score >= 80) {
			System.out.println("점수가 80점이상 ~ 90점미만 입니다\n등급은 B 등급 입니다");
		} else if (score >= 70) {
			System.out.println("점수가 70점이상 ~ 80점미만 입니다\n등급은 C 등급 입니다");
		} else if (score >= 60) {
			System.out.println("점수가 60점이상 ~ 70점미만 입니다\n등급은 D 등급 입니다");
		} else {
			System.out.println("점수가 60점 보다 작습니다\n당신은 F등급, 재시험 입니다");
		}
//		if(score < 90) {
//			System.out.println("점수가 90점 보다 작습니다\n당신은 재시험 입니다");
//		}
		
	}
}
