package ch05;

public class Code04 {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변 입니다. 자바 문자열은 String 입니다.";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String ssnString = "880815-1234567";
		String firstNum = ssnString.substring(0,6);
		String secondNum = ssnString.substring(7);
		System.out.println(firstNum);
		System.out.println(secondNum);
		
	}
}