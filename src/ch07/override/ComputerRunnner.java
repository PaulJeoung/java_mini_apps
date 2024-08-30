package ch07.override;

public class ComputerRunnner {

	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r) + "\n");
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
	}
}
