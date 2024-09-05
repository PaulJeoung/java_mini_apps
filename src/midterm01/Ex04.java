package midterm01;

public class Ex04 {

	public static void main(String[] args) {
		
		int a = 3;
		int x = (a++) * (2 + a);
		
		System.out.println("a = " + a); // 4
		System.out.println("x = " + x); // 18
	}
}