package ch98.no1;


public class CalculatorTestEx01 {

	public static void main(String[] args) {
		
		boolean flag = true;
		int result = 0;
		Calculator calculator = new Calculator();
		
		System.out.println("=====사칙연산 계산기=======");
		
		
		while (flag) {
			System.out.println("[+][-][*][-][q]");
			String menu = calculator.scanner.nextLine();
			System.out.println(menu);
			
			System.out.println("첫번째 숫자 > ");
			int x = calculator.scanner.nextInt();
			System.out.println("두번째 숫자 > ");
			int y = calculator.scanner.nextInt();
			calculator.scanner.nextLine();
			
			if (menu.equals(calculator.getPlus())) {
				result = calculator.plus(x, y);
				System.out.println(x+" + "+y+" = "+result);
			} else if (menu.equals(calculator.getMinus())) {
				result = calculator.minus(x, y);
				System.out.println(x+" - "+y+" = "+result);
			} else if (menu.equals(calculator.getMultiply())) {
				result = calculator.mutiply(x, y);
				System.out.println(x+" x "+y+" = "+result);
			} else if (menu.equals(calculator.getDivide())){
				result = calculator.divide(x, y);
				System.out.println(x+" / "+y+" = "+result);
			} else if (menu.equals(calculator.getExit())) {
				flag = false;
				break;
			} else {
				System.out.println("잘못 입력 되었습니다");
			}
			
		}
	}
}
