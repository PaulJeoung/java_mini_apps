package ch07.sealed_class;

public final class Employee extends Person{
	@Override
	public void work() {
		System.out.println("제품을 생산 합니다");
	}
}
