package ch08.interface_8_07;

public class App {

	public static void main(String[] args) {
		
		Service service = new ServiceImpl();
		
		service.defaultMethod1(); // serviceImpl 에서 상속한 Service 인터페이스를 호출
		service.defaultMethod2();
		
		System.out.println();
		
		Service.staticMethod1(); // Service 인터페이스를 호출
		Service.staticMethod2();
		
	}

}
