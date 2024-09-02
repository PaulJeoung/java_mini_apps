package ch08.interface_8_09;

public class InterfaceImpl implements InterfaceC{
	@Override
	public void methodA() {
		System.out.println("인터페이스 A");
	}
	
	@Override
	public void methodB() {
		System.out.println("인터페이스 B");
	}
	
	@Override
	public void methodC() {
		System.out.println("인터페이스 C");
	}
	
}
