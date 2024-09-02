package ch08.interface_8_13;

public class ImplClass implements InterfaceC {
	@Override
	public void methodA() {
		System.out.println("메소드 에이 재정의");
	}
	
	@Override
	public void methodB() {
		System.out.println("메소드 삐이 재정의");
	}
	
	@Override
	public void methodC() {
		System.out.println("메소드 띠이 재정의");
	}
}
