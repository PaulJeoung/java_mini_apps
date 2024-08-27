package ch02;

public class Code00 {
	public static void main(String[] args) {
//		int x = 10, y = 20;
//		System.out.println("x + y = " + x + y);
//		System.out.println(x + y);
//		System.out.println(x + y + " x + y = " + x + y);
//		System.out.println(x + y + " x + y = " + (x + y));
		
		int result1 = 10 + 2 + 8;
		System.out.println("result1 : " + result1);
		
		String result2 = 10 + 2 + "8";
		System.out.println("result2 : " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3 : " + result3);
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4 : " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5 : " + result5);
		
		int a = 22;
		System.out.printf("%6d", a);
	}
}
