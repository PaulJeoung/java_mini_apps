package ch05;

public class Code06_1 {

	public static void main(String[] args) {
		int [] scores;
		scores = new int[] {83,90,97};
		
		int sum1 = 0;
		for (int i=1; i<scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		for (int i=0; i<3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
		System.out.println("==============new func=================");
		printItem(new int[] {73,80,87});
	}
	public static void printItem(int[] scores) {
		for (int i=0; i<scores.length; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}

}
