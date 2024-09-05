package ch99_exercise;

import java.util.Random;
import java.util.Scanner;

public class ForGrammerExercise {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("유저 수를 입력해 주세요 > ");
		int size = scanner.nextInt();
		scanner.nextLine();
		
		int ranNum = (int)((Math.random()*99)+100);
		int cnt = 10;
		String[][][] data = new String[size][2][3];
				
		for (int i=0; i<size; i++) {
			for (int j=0; j<data[i].length; j++) {
				// data[i][j] = ""; 
				for (int k=0; k<data[i][j].length; k++) {
					data[i][j][k]= (int)((Math.random()*99)+100)+" : User "+i;
					cnt++;
				}
			}
		}
		for (int i=0; i<size; i++) {
			for (int j=0; j<data[i].length; j++) {
				for (int k=0; k<data[i][j].length; k++) {
					System.out.println(data[i][j][k]);
				}
			}
		}
	}
}
