package ch07.abstrac_t;

public class PhoneRunner {

	public static void main(String[] args) {
				
		SmartPhone smartPhone = new SmartPhone("Smith");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		System.out.println("스마트폰 주인은? "+smartPhone.owner);

	}

}
