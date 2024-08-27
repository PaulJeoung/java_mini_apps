package ch02;

public class Code02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int hour = 3;
//		int minute = 5;
//		System.out.println(hour + "h" + minute + "m");
//		int totalMinute = (hour * 60) + minute;
//		System.out.println("Total minute : " + totalMinute + "min");
		
		int x = 3, y = 5;
		System.out.println("x: " + x + ", y : " + y);
		int originX = x;
		x = y;
		y = originX;
		System.out.println("x: " + x + ", y : " + y);
		int a = 52;
		String binaryNum = Integer.toBinaryString(a);
		String octopusNum = Integer.toOctalString(a);
		String hexaNum = Integer.toHexString(a);
		System.out.println(binaryNum + " : " + octopusNum + " : " + hexaNum);
	}
}
