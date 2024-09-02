package ch07.sealed_class;

public sealed class Person permits Employee, Manager{
	public String name;
	
	public void work() {
		System.out.println("하는일이 결정되지 않았습니다");
	}
}
