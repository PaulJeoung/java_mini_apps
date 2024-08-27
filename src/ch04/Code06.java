package ch04;

import java.util.Scanner;

public class Code06 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료 하려면 exit를 입력 하세요");
		
		Scanner msg = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = msg.nextLine();
			if (inputString.equals("exit")) {
				break;
			} else if (inputString.equals("EXIT")) {
				inputString = "exit";
				break;
			}
			System.out.println("INPUT MESSAGE = " + inputString);
		} while (! inputString.equals("exit"));
		System.out.println("프로그램 종료");
	}
}
