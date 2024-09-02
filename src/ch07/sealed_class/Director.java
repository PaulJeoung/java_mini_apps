package ch07.sealed_class;

public class Director extends Manager {
	@Override
	public void work() {
		System.out.println("제품을 기획 합니다");
	}
}
