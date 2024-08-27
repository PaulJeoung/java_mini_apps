package ch02;

public class Code09 {
	public static void main(String[] args) {
		byte x = 10, y = 20;
		byte result00 = (byte) (x + y); // or int result = x + y;
		System.out.println(result00);
		
		int intValue = 10;
		double doubleValue = 5.5;
		double result01 = intValue + doubleValue; // 형지정을 하면 따로 변환 할 필요가 없다구
		System.out.println(result01);
		
		System.out.println("===================================== p.64");
		
		byte result1 = 10 + 20;
		System.out.println("result1 : " + result1);
		
		byte v1 = 10, v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2 : " + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		System.out.println("result3 : " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4 : " + result4);
		System.out.println("result4 : " + (char)result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5 : " + result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6 : " + result6);
		
		int var10 = 1, var11 = 2;
		double result7 = (double) var10 / var11;
		System.out.println("result7 : " + result7);
	}
}
