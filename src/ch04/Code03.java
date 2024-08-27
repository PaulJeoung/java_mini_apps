package ch04;

public class Code03 {
	public static void main(String[] args) {
//		int num = (int)(Math.random()*6)+1;
//		
//		switch(num) {
//		case 1:
//			System.out.println("1번이 나왔습니다"); break;
//		case 2:
//			System.out.println("2번이 나왔습니다"); break;
//		case 3:
//			System.out.println("3번이 나왔습니다"); break;
//		case 4:
//			System.out.println("4번이 나왔습니다"); break;
//		case 5:
//			System.out.println("5번이 나왔습니다"); break;
//		default:
//			System.out.println("6번이 나왔습니다"); break;
//		}
		char grade = 'A';
		switch (grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다");
			case 'B', 'b' -> System.out.println("일반 회원입니다");
			default -> System.out.println("손님 입니다");
		}
	}
}
