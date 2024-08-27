package ch05;

public class Code08 {

	public static void main(String[] args) {
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		for (int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i]; 
		}
		for (int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i]+" | ");
		}
//		for (int i : newIntArray) {
//			System.out.println(newIntArray);
//		}
	}

}
