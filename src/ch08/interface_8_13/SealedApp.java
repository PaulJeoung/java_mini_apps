package ch08.interface_8_13;

public class SealedApp {
	public static void main(String[] args) {
		
		ImplClass impl = new ImplClass();
		
		InterfaceA interA = impl;
		interA.methodA();
		System.out.println();
		
		InterfaceB interB = impl;
		interB.methodA();
		interB.methodB();
		System.out.println();
		
		InterfaceC interC = impl;
		interC.methodA();
		interC.methodB();
		interC.methodC();
		
	}
}
