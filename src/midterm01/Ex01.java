package midterm01;

import java.util.Scanner;

public class Ex01 {
	public static void main	(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x, y;
		
		System.out.println("x와 y의 사칙연산을 합니다");
		System.out.println("x의 값 입력 : (사용자 입력)");
		x = scanner.nextInt();
		
		System.out.println("y의 값 입력 : (사용자 입력)");
		y = scanner.nextInt();
		
		System.out.println("x + y = " + plus(x, y));
		System.out.println("x - y = " + minus(x, y));
		System.out.println("x * y = " + multiple(x, y));
		System.out.println("x / y = " + divide(x, y));
	}
	
	public static int plus (int x, int y) {
		return x + y;
	}
	public static int minus (int x, int y) {
		return x - y;
	}
	public static int multiple (int x, int y) {
		return x * y;
	}
	public static int divide (int x, int y) {
		return x / y;
	}
}