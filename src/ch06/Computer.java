package ch06;

public class Computer {
	int sum (int ... valus) {
		int sum = 0;
		
		for (int i=0; i<valus.length; i++) {
			sum += valus[i];
		}
		
		return sum;
	}
}
