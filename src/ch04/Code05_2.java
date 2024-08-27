package ch04;

import java.util.Scanner;

public class Code05_2 {
	public static void main(String[] args) {
		
		Scanner inputValue = new Scanner(System.in);
		System.out.print("몇 단까지 알아보고 오셨thㅔ요? (2단 부터~) : ");
		String strX = inputValue.nextLine();
		int dan = Integer.parseInt(strX); // 2;
		int i = 2;
		
		while (i<=dan) {
			System.out.print("\n|"+i+"단||");
			int j = 1;
			while (j<=9) {
				System.out.print(i+"X"+j+"="+(i*j)+"|");
				j++;
			}
			i++;
		}
		System.out.println("\n구구단 프로그램을 종료 합니다");
	}
}