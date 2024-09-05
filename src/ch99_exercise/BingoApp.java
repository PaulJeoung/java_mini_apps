package ch99_exercise;

import java.util.Scanner;

public class BingoApp {
	
	private static int size = 3; // 빙고 사이즈
	private static String[][] bingoTable = new String [size][size];
	private static int[] usedNum = new int[size*size];
	private static String clear = "X";
	private static int startNumbers = 1;
	private static int endNumbers = size * size;
	private static Scanner scanner = new Scanner(System.in);
	private static int myNum;
	private static int aiNum;
	

	public static void main(String[] args) {
		
		for (int i=0; i<bingoTable.length; i++) { // 빙고 판 생성
			for (int j=0; j<bingoTable[i].length; j++) {
				if (startNumbers<10) {
					String num = " " + Integer.toString(startNumbers);
					bingoTable[i][j] = num;
				} else {
					String num = Integer.toString(startNumbers);
					bingoTable[i][j] = num;
				}
				startNumbers ++;
			}
		}
		
		for (int i=0; i<bingoTable.length; i++) { // 빙고 판 출력
			System.out.println("\n");
			for (int j=0; j<bingoTable[i].length; j++) {
				System.out.print("   " + bingoTable[i][j]);
			}
		}
		
		System.out.println();
		
		while(true) {
			System.out.println();
			vsMe();
			vsAi();
		}
		
	}
	
	public static void vsAi() {
		System.out.println("AI 는 개발 중입니다");
		
	}
	public static void vsMe() {
		System.out.println("숫자를 말해주세요 : ");
		myNum = scanner.nextInt();
		System.out.println(usedNum.length);
		for (int i=0; i<usedNum.length; i++) {
			System.out.print(usedNum[i] + "  ");
		}
		for (int i=0; i<usedNum.length; i++) {
			if (myNum == usedNum[i]) {
				System.out.println("이미 클리어된 숫자 입니다");
				break;
			} else if (myNum > endNumbers) {
				System.out.println("빙고에 맞는 숫자가 아닙니다");
				break;
			} else {

			}
			usedNum[i] = myNum;
		}
		System.out.println(myNum + " 을 선택 하였습니다");
	}
}
