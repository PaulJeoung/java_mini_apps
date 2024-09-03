package ch99_midtest;

import java.util.Scanner;

public class ThousandCalculatorApp {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int cnt = 1;
		int sum = 0;
		int[] numbers = new int[100];
		
		System.out.println("계속 숫자를 입력 해 주세요 (누적 합계가 1,000이 넘으면 종료 합니다)");
		
		for (int i=0; i<cnt; i++) {
			System.out.println("입력 > ");
			num = scanner.nextInt();
			numbers[i] = num;
			cnt ++;
			sum += numbers[i];
			
			if (sum <= 1000) {
				System.out.println("합계는 > " + sum);
				continue;
			} else {
				System.out.println("1,000 이 넘어 종료 합니다. \n합계는 > " + (sum - num));
				break;
			}
			
		}
	}
}
