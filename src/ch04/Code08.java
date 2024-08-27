package ch04;

public class Code08 {
	public static void main(String[] args) {
		for(int k=1; k<=10; k++) {
			if(k%2 !=0) {
				continue;
			}
			System.out.print(k + "  ");
		}
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			if (i%3 == 0) {
				sum +=i;
				} else {
					continue;
				}
			}
			System.out.print(sum);
	}
}
