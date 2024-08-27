package ch03;

public class Code01 {

	public static void main(String[] args) {
//		int x = -100;
//		x = -x;
//		byte b = 100;
//		int y = -b;
//		System.out.println("x : " + x);
//		System.out.println("y : " + y);
		
		int x1 = 10;
		int y1 = 10;
		int z1;
		
		x1++; // 11
		++x1; // 12
		System.out.println("x1 = " + x1 + "\n");
		
		y1--; // 9
		--y1; // 8
		System.out.println("y1 = " + y1 + "\n");
		
		
		z1 = x1++; // 12
		System.out.println("x1 = " + x1);
		System.out.println("z1 = " + z1 + "\n");
		
		z1 = ++x1; // 14
		System.out.println("x1 = " + x1);
		System.out.println("z1 = " + z1 + "\n");
		
		z1 = ++x1 + y1++; // 15 + 9
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);
		System.out.println("z1 = " + z1);
	}

}
