package ch03;

public class Code08 {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25)); // 9
		System.out.println("45 | 25 = " + (45 | 25)); // 61
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 52
		System.out.println("~45 = " + (~45)); // -46
		
		byte revData = -120;
		
		int unsignedInt1 = revData & 255;
		System.out.println(unsignedInt1); // 136
		
		int unsignedInt2 = Byte.toUnsignedInt(revData);
		System.out.println(unsignedInt2); // 136
		
		int test = 136;
		byte btest = (byte)test;
		System.out.println(btest); // -120
	}
}