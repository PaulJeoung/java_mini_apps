/*
사용자가 날짜를 입력 하면 날짜의 요일이 출력 결과처럼 나오게 코드를 작성 하시오
(클래스명을 Day, DayTestEx03으로 만들것)

조건1) Day 클래스에 년, 월, 일 변수를 private로 선언하고 생성자를 년, 월, 일로 만들것
그리고 년, 월, 일을 취득 하게 하는 get()을 만들고 년, 월, 일을 설정 하는 set()을 만들것
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

public class Day {

	private int year;
	private int month;
	private int date;
	
	
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDate() {
		return this.date;
	}
	
	int dayofWeek() { // 윤달 계산 로직
		int y = year;
		int m = month;
		if (m == 1 || m ==2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
		// 2000 + 500 - 20 + 5 + 30.2 + 18 = 2533.2 % 7
	}
	
}
