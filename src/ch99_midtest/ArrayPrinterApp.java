package ch99_midtest;

import java.util.Scanner;

public class ArrayPrinterApp {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("배열의 길이를 입력해 주세요 > ");
		int size = scanner.nextInt();
		scanner.nextLine(); // 개행 처링
		
		String[] array = new String[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("배열["+ i +"] 안에 들어갈 내용을 입력해 주세요 > ");
			array[i] = scanner.nextLine();
		}
		
		System.out.println("배열에 입력된 값은 다음과 같습니다");
		for (int i=0; i<array.length; i++) {
			System.out.println("Index["+ i +"] : 입력값 > " + array[i]);
		}
		
		scanner.close();
		
	}
}
