package ch99_midtest;

import java.util.Scanner;

public class RandomNumbersApp {
	public static void main(String[] args) {
		
		int randomNumber = (int)((Math.random() * 99) + 1);
		int cnt = 1, number = 0;
		boolean game = true;
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("0 부터 99 중에 숫자를 골라 보세요 > ");
			number = scanner.nextInt();
			
			if (number != randomNumber) {
				System.out.println("야레야레~ | 입력값 : " + number + " | 정답 : ** | 횟수 : " + cnt);
				hint(randomNumber, number);
				cnt ++;
			} else {
				System.out.println("스고이!! | 정답 : " + randomNumber + " | 입력값 : " + number + " | 횟수 : " + cnt);
				game = false;
				System.out.println("게임을 종료 하자쿠");
				break;
			}
		}
	}
	
	public static void hint(int result, int hint) {
		if (result > hint) {
			System.out.println("더 높은 숫자 라구 !!");
		} else {
			System.out.println("더 낮은 숫자 라구 !!");
		}
		
	}
}
