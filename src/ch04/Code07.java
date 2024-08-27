package ch04;

public class Code07 {
	public static void main(String[] args) {
		while (true) {
			int num = (int)(Math.random()*6)+1;
			if(num == 6) {
				System.out.println("주사위 번호가 6이라 빠져 나갑니다");
				break;
			}
			System.out.println("주사위 번호는 " + num + "번입니다");
		}
		System.out.println("프로그램 종료");
	}
}
