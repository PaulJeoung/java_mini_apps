/*
사용자가 날짜를 입력 하면 날짜의 요일이 출력 결과처럼 나오게 코드를 작성 하시오
(클래스명을 Day, DayTestEx03으로 만들것)

조건1) Day 클래스에 년, 월, 일 변수를 private로 선언하고 생성자를 년, 월, 일로 만들것 @
그리고 년, 월, 일을 취득 하게 하는 get()을 만들고 년, 월, 일을 설정 하는 set()을 만들것 @
마지막으로 요일을 계산 하는 dayofWeek()를 선언 하고 논리 합 연산자를 적용할것 
조건2) DayTestEx03 클래스에 요일 값 넣을 배열을 선언하고 사용자가 입력한 년, 월, 일을 나오게 할 것

출력결과)
생일을 양력으로 입력하시오
년 : 2000 (사용자 입력)
월 : 11 (사용자 입력)
일 : 18 (사용자 입력)
당신의 생일 2000년 11월 18일은 토요일 입니다
 */

package ch99_midtest;

import java.util.Scanner;

public class DayFinderApp {
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
		
		System.out.println("생일을 양력으로 입력하시오");
		System.out.println("년 : (사용자 입력, 2000)");
		int year = scanner.nextInt();
		System.out.println("월 : (사용자 입력, 11)");
		int month = scanner.nextInt();
		System.out.println("일 : (사용자 입력, 18)");
		int date = scanner.nextInt();
		Day day = new Day(year, month, date);
		
		int result = day.dayofWeek();
		System.out.println("result : " + result);
		
		for (int i=0; i < days.length; i++) {			
			if (i == result) {
				System.out.println("당신의 생일은 " + year + "년 " + month + "월 " + date + "일 " + days[i] + " 입니다");
			} else {
				continue;
			}
		}

	}
	
}

