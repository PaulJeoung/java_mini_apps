package ch06;

public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
//		int resultPlus1 = myCalc.plus(5, 6);
//		System.out.println("계산 결과 : " + resultPlus1);
//		
//		int x = 10;
//		int y = 4;
//		double resultDivide1 = myCalc.divide(x, y);
//		System.out.println("계산 결과 : " + resultDivide1);
		
		double result1 = myCalc.areaRectangle(9);
		double result2 = myCalc.areaRectangle(7, 4);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
		
		double stResult1 = 10 * 10 * Calculator.pi;
		int stResult2 = Calculator.plus(20, 4);
		int stResult4 = Calculator.minus(100, 34);
		
		System.out.println("A1) " + stResult1 + " | A2) " + stResult2 + " | A3) " + stResult4);
		
		myCalc.powerOff();
	}

}
