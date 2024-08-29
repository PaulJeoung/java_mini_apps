package ch06;

public class ComputerRunner {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int result1 = myCom.sum(1,2,3);
		System.out.println("Result : " + result1);
		
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("Rsult : " + result2);
		
		int[] values = {1,2,3,4,5,6,7};
		int result3 = myCom.sum(values);
		System.out.println("Result3 : " + result3);
		
		int result4 = myCom.sum(new int[] {10,9,8,7,6});
		System.out.println("Result4 : " + result4);
	}

}
