package ch04;

public class Code04_1 {
	public static void main(String[] args) {
//		for (float x=0.1f; x<=1.0f; x+=0.1f) {
//			System.out.println(x);
//		}
		for (int i=2; i<=9; i++) {
			System.out.print("\n| " + i + " 단 || ");
			for (int j=1; j<=9; j++) {
				System.out.print(i + "X" + j + "=" + (i * j) + " | ");
			}
		}
	}
}
