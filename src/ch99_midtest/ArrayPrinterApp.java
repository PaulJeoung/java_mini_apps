package ch99_midtest;

import java.util.Scanner;

public class ArrayPrinterApp {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String [] arrayData = null;
		String quit = "q";
		int userCount = scanner.nextInt();
		
		for (int i=0; i<userCount; i++) {
			String arrValue = scanner.nextLine();
			arrayData[i] = arrValue;
			if (arrValue.equals(quit)) {
				
			} else {
				continue;
			}
		
//		for (int k=0; i<arrayData.length; k++) {
//			System.out.println(arrayData[k]);
//		}
			
		}
		
		
		
	}
}
