package ch11.exception_5;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		findClass();
		
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			System.out.println("EXCEPT PROCESS : "+e.toString());
//		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
