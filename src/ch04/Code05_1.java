package ch04;

import java.util.Scanner;

public class Code05_1 {
	public static void main(String[] args) {
		Scanner inputValue = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("====================");
			System.out.println("1.가속 | 2.감속 | 3.중지");
			System.out.println("====================");
			System.out.println("선택하세요 : ");
			
			String strNum = inputValue.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 : " + speed + "km/h");
			} else if (strNum.equals("2")) {
				speed = (speed > 0) ? --speed : 0;
				System.out.println((speed == 0) ? "속도가 0 입니다. 다시 입력해 주세요" : "현재 속도는 " + speed + "km/h");
//				if (speed == 0) {
//					System.out.println("속도가 0 입니다. 다시 입력 해 주세요");
//				} else {
//					speed--;
//					System.out.println("현재 속도 : " + speed + "km/h");
//				}
			} else if (strNum.equals("3")) {
				run = false;
			} else {
				System.out.println("제대로 된 번호를 넣으세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
