package ch05;

public class Code05_1 {

	public static void main(String[] args) {
		String borad = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		String[] tokenStrings = borad.split(",");
		
		System.out.println("Number : " + tokenStrings[0]);
		System.out.println("Title : " + tokenStrings[1]);
		System.out.println("Desc : " + tokenStrings[2]);
		System.out.println("Name : " + tokenStrings[3]);
		
		System.out.println("===================================");
		
		for(int i=0; i<tokenStrings.length; i++) {
			System.out.println(tokenStrings[i]);
		}
	}
}
