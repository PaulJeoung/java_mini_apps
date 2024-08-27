package ch04;

public class Code05 {
	public static void main(String[] args) {
		int j = 1;
		while (j<=10) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println(" ");
		int sum = 0;
		int i = 1;
		while(i<=100) {
			sum +=i;
			i++;
		}
		System.out.println((i-100) + " 부터 " + (i-1) + " 까지 합 : " + sum);
	}
}
