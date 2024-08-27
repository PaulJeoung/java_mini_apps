package ch05;

import java.util.Scanner;

public class Code99_exam9 {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println(" 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("----------------------------------------------");
			
			System.out.println("선택 > ");
			String inputValue = inputData.nextLine();
			
			
			int menuValue = Integer.parseInt(inputValue);
			switch (menuValue) {
			case 1:
				System.out.println("학생수>");
				break;
			case 2:
				System.out.println("점수입력>");
				break;
			case 3:
				System.out.println("점수리스트>");
				break;
			case 4:
				System.out.println("분석>");
				break;

			default:
				System.out.println("선택> 5\n프로그램을 종료 합니다");
				break;
			}
			
		}
		
	}

}
