package ch03;

public class Code05 {
	public static void main(String[] args) {
		int x = 5;
		double y = 3.0;
		double z = x / y;
//		double z = x % y;
		System.out.println(z);
//		System.out.println("z + 2 결과 : " + (z + 2));
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println("z + 2 결과 : " + (z + 2));
		}
	}
}
