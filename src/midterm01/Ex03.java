package midterm01;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
			
		Scanner stdln = new Scanner(System.in);
		Random rand = new Random();
		
		int random = rand.nextInt(100);
		random = random-1; // 0~99 까지 만들기
		int cnt = 1, number = 0;
		boolean flag = true;

		while (flag) {
			// System.out.println(random); // 랜덤 숫자
			System.out.println("0 부터 99 중에 숫자를 골라 보세요 \n몇 일까요? : ");
			number = stdln.nextInt();
			
			if (number != random) {
				System.out.println("입력값 : " + number + " | 정답 : ** | 횟수 : " + cnt);
				tip(random, number);
				cnt ++;
			} else {
				System.out.println("정답 입니다!!\n입력값 : " + random + " | 입력값 : " + number + " | 횟수 : " + cnt);
				flag = false;
				System.out.println("게임을 종료 합니다");
				break;
			}
		}
	}
	public static void tip(int result, int tip) { // 힌트 메서드
		if (result > tip) {
			System.out.println("더 큰 수 입니다");
		} else {
			System.out.println("더 작은 수 입니다");
		}
	}
}