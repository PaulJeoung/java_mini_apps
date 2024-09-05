package ch11.exception_2;

public class ExceptionHandler {

	public static void main(String[] args) {
		System.out.println("[시스템 시작]");
		printLength("THISISJAVA");
		printLength(null);
		System.out.println("[시스템 종료]");

	}
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수 : " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("[시스템 처리중]");
		}
	}

}
