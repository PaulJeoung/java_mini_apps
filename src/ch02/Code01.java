package ch02;

public class Code01 {
	public static void main(String[] args) {
		int height = 10;
		
		if (height%2 == 0) {
			height = height + 1;
		}
		for (int i = 1; i <= height; i++) {
			for (int j = height - 1; j < 0; j--) {
				System.out.print("");
			}
			for (int k = 1; k < (height / 2) + 1; k++)
				System.out.print("*");
			}
			System.out.println("");
		
//		for (int i = 1; i <= height; i++) {
//			for (int j = height-i; j > 0; j--) {
//				System.out.print("");
//			}
//			for (int k = 1; k <= 2 * i - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
