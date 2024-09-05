package ch98.no7;

public class DayClass {

	private int year;
	private int month;
	private int date;
	
	public DayClass(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
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
