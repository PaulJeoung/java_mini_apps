package ch05;

public class Code06_2 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i=0; i<arr1.length; i++) {
			System.out.print("arr1 [" + i + "] : " + arr1[i]+ ", " );
		}
		System.out.println("\n======================= int 형 null\n");
		arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
		for (int i=0; i<arr1.length; i++) {
			System.out.print("arr1 [" + i + "] : " + arr1[i]+ ", " );
		}
		System.out.println("\n======================= int 형 대입\n");
		
		double[] arr2 = new double[3];
		for (int i=0; i<arr2.length; i++) {
			System.out.print("arr2 [" + i + "] : " + arr2[i]+ ", " );
		}
		System.out.println("\n======================= double 형 null\n");
		arr2[0] = 0.1; arr2[1] = 0.5; arr2[2] = 1.0;
		for (int i=0; i<arr2.length; i++) {
			System.out.print("arr1 [" + i + "] : " + arr2[i]+ ", " );
		}
		System.out.println("\n======================= double 형 대입\n");
		
		String[] arr3 = new String[3];
		for (int i=0; i<arr3.length; i++) {
			System.out.print("arr3 [" + i + "] : " + arr3[i]+ ", " );
		}
		System.out.println("\n======================= String 형 null\n");
		arr3[0] = "1월"; arr3[1] = "2월"; arr3[2] = "3월";
		for (int i=0; i<arr3.length; i++) {
			System.out.print("arr3 [" + i + "] : " + arr3[i]+ ", " );
		}
		System.out.println("\n======================= String 형 대입\n");
	}

}
