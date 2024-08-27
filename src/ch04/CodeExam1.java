package ch04;

import java.util.Scanner;

public class CodeExam1 {

	public static void main(String[] args) {
		Scanner bankScanner = new Scanner(System.in);
		
		String depositMsg = " 원 입금이 완료 되었습니다";
		String widtrowMsg = " 원 출금이 완료 되었습니다";
		String retriveMsg = " 원 잔액이 조회 되었습니다";

		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("++++++++++++++++++++++++++");
			System.out.println("++ 1. 예금");
			System.out.println("++ 2. 출금");
			System.out.println("++ 3. 조회");
			System.out.println("++ 4. 종료");
			System.out.println("++  원하시는 메뉴를 입력 하세요 ++");
			String inputData = bankScanner.nextLine();
			int value = Integer.parseInt(inputData);
			System.out.println("선택 > "+inputData);
			if (value==1) {
				System.out.println("입력할 금액을 넣어 주세요");
				String inputBalance = bankScanner.nextLine();
				int myBalance = Integer.parseInt(inputBalance);
				balance = balance+myBalance;
				System.out.println(balance+depositMsg);
			} else if (value==2 && balance > 0) {
				System.out.println(balance+retriveMsg);
				System.out.println("출금할 금액을 넣어 주세요");
				String widtrowBalance = bankScanner.nextLine();
				int myWidtrow = Integer.parseInt(widtrowBalance);
				balance = balance-myWidtrow;
				if (balance > 0) {
					System.out.println(widtrowBalance+"원을 입력 하였습니다");
				} else {
					System.out.println("잔액이 맞지 않습니다. 메뉴로 이동 합니다");
				}
				System.out.println(balance+retriveMsg);
			} else if (value==2 && balance <= 0) {
				System.out.println("잔액이 없습니다. 다른 메뉴를 선택해 주세요");
			} else if (value==3) {
				System.out.println(balance+retriveMsg);
			} else if (value==4) {
				System.out.println("어플을 종료 합니다");
				run = false;
			} else {
				System.out.println("잘못된 요청입니다. 다시 입력 하세요");
			}
		 }

	}

}
