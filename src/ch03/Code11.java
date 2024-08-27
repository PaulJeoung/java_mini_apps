package ch03;

import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
//		int score = 85;
		Scanner scanScore = new Scanner(System.in);
		
		System.out.print("input Your Score ");
		String strScore = scanScore.nextLine();
		int score = Integer.parseInt(strScore);
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다");
	}

}
