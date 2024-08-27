package ch05;

public class Code05_0 {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 프가 index = 3
		System.out.println(location); // 3
		String subString = subject.substring(location); // 3 번 부터 끝까지
		System.out.println(subString); // 프로그래밍
		
		location = subject.indexOf("자바"); // 자가 index = 0
		System.out.println(location); // 0
		if(location != -1) { // index 에 포함을 안시킬때 사용
			System.out.println("자바와 관련된 책이군요");
		} else { // 0이니까 
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		int location1 = subject.indexOf("자바");
		String subString1 = subject.substring(location1, 3);
		System.out.println(subString1);
	}

}
