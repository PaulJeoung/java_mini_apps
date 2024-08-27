package ch02;

public class Code07 {
	public static void main(String[] args) {
		String str1 = "" +
				"{\n" + 
				"\t\"id\":\"winter\",\n" + 
				"\t\"name\":\"눈송이\",\n" +
				"}";
		String str2 = """
					{
						"id" : "winter",
						"name" : "눈송이"
					}
					""";
		System.out.print(str1);
		System.out.print("____________________\n");
		System.out.print(str2);
		System.out.print("____________________\n");
		
		String str = """
				나는 자바를 \
				학습 합니다.
				나는 자바 고수가 맛있습니다 뷁!!
				""";
		System.out.println(str);
	}
}
