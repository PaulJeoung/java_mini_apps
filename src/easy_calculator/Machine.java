/* 
 * Author        : pj
 * Class Name    : System.java
 * modified date : 2024-08-29
 * description   : 계산기 전원 ON/OFF
 * */

package easy_calculator;

import java.util.Scanner;
import easy_calculator.SystemMessages;
import easy_calculator.MenuSelector;
import easy_calculator.Calculator;

public class Machine {
	
	boolean power;
	private static Scanner input = new Scanner(System.in);
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	boolean isPower() {
		if (power == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public void runSystem () {
		while (power) {
			System.out.println(SystemMessages.valueOf("SYSTEM_ON"));
			System.out.println("---------------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셉 | 4.나눗셈 | 5.종료");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(input.nextLine());
			
			switch (selectNo) {
			
			case MenuSelector.PLUS:
				System.out.println(selectNo + "번, 덧셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				System.out.println("1 번째 > ");
				double plusA = input.nextDouble();
				System.out.println("2 번째 > ");
				double plusB = input.nextDouble();
				
				System.out.println(Calculator.plus(plusA, plusB));
				
			case MenuSelector.MINUS:
				System.out.println(selectNo + "번, 뺄셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				System.out.println("1 번째 > ");
				double minusA = input.nextDouble();
				System.out.println("2 번째 > ");
				double minusB = input.nextDouble();
				
				System.out.println(Calculator.plus(minusA, minusB));
				
			case MenuSelector.MULTIPLE:
				System.out.println(selectNo + "번, 곱셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				System.out.println("1 번째 > ");
				double multipleA = input.nextDouble();
				System.out.println("2 번째 > ");
				double multipleB = input.nextDouble();
				
				System.out.println(Calculator.plus(multipleA, multipleB));
			
			
			case MenuSelector.DEVIDE:
				System.out.println(selectNo + "번, 나눗셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				System.out.println("1 번째 > ");
				double devideA = input.nextDouble();
				System.out.println("2 번째 > ");
				double devideB = input.nextDouble();
				
				System.out.println(Calculator.plus(devideA, devideB));
				
			case MenuSelector.EXIT:
				System.out.println(SystemMessages.valueOf("SYSTEM_OFF"));
				power = false;
				
			default:
				System.out.println(SystemMessages.valueOf("INVALID_INPUT") + " | 입력값 : " + selectNo);
			}
		}
	}
	
}