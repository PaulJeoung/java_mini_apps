package ch98.no7;

import java.util.Scanner;

public class CalendarApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String [] days = {"일", "월", "화", "수", "목", "금", "토"};
		
		int y = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		
		DayClass data = new DayClass(y, m, d);
		
		
		int birth =  data.dayofWeek();
		
		for (int i=0; i<days.length; i++) {
			if (birth == i) {
				System.out.println(days[i]);
				break;
			}
		}
		
	}

}
