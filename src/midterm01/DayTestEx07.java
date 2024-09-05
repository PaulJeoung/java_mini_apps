package midterm01;

import java.util.Scanner;

public class DayTestEx07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println("나의 생일 찾기 서비스 입니다");
		System.out.println("생일을 양력으로 입력해 주세요");
		
		System.out.println("년 : 2000 (사용자 입력)");
		int y = scanner.nextInt();
		System.out.println("월 :   11 (사용자 입력)");
		int m = scanner.nextInt();
		System.out.println("일 :   18 (사용자 입력)");
		int d = scanner.nextInt();
		
		Day myBirthdayDay = new Day(y, m, d);		
		int result =  myBirthdayDay.dayofWeek();
		
		for (int i=0; i<days.length; i++) {
			if (i==result) {
				System.out.println("당신의 생일 "+ y +"년 " + m + "월 " + d + "일은 " + days[i] + "요일 입니다");
				break;
			}
		}
	}
}