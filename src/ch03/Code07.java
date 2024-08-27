package ch03;

public class Code07 {

	public static void main(String[] args) {
		// int charCode = 'A';
		// int charCode = 'a';
		int charCode = '5';
		 
		int value = 6;
		// int value = 7;
			
		if ((65 <= charCode) && (charCode <= 90)) {
			System.out.println("Caps Character");
		}
		if ((97 <= charCode) && (charCode <= 122)) {
			System.out.println("Small Character");
		}
		if ((48 <= charCode) && (charCode <= 57)) {
			System.out.println("It`s numbers");
		}
		
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("Mutiple of 2 or 3");
		}
		
		Boolean result = (value%2 == 0) || (value%3 == 0);
		if (!result) {
			System.out.println("NOT A Multiple of 2 or3");
		}
	}

}
