package ch99_midtest;

//  사용자가 날짜를 입력하면, 날짜의 요일이 출력 (case문?), 윤년 검증 2000년 11월 18일은 토요일 입니다 출력

public class DayFinderApp {
	public static void main(String[] args) {
		
		
	}
	
	private int year;
	private int month;
	private int date;
	
	int dayofweek() {
		int y = year;
		int m = month;
		if (m == 1 || m ==2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
}

//nickName은 final 특성을 갖기 때문에 startChat() 메소드에서 nickName = chatId와 같이 
//값을 변경할 수 없다. 따라서 String nickName = null;과 nickName = chatId;를 제거하고 대
//신 String nickName = chatId;를 넣어야 한다.

