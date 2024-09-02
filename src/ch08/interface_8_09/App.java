package ch08.interface_8_09;

public class App {

	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();

		InterfaceA iA = impl;
		iA.methodA();
		
		System.out.println();		
		InterfaceB iB = impl;
		iB.methodB();
		
		System.out.println();
		InterfaceC iC = impl;
		iC.methodC();
		iC.methodB();
		iC.methodA();
		
	}

}
