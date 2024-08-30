package ch07;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		System.out.println("Model Name  : " + myPhone.model);
		System.out.println("Phone Color : " + myPhone.color);
	}
}
