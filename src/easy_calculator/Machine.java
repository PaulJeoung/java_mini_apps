/* 
 * Author        : pj
 * Class Name    : System.java
 * modified date : 2024-08-29
 * description   : 계산기 전원 ON/OFF
 * */

package easy_calculator;

//import java.util.Scanner;
//import easy_calculator.SystemMessages;
//import easy_calculator.MenuSelector;
//import easy_calculator.Calculator;
//import easy_calculator.InputReceiver;

public class Machine {
	
	boolean power;
	
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
			System.out.println(SystemMessages.valueOf("BOARD_LINE"));
			System.out.println(SystemMessages.valueOf("MENU_SET"));
			
			InputReceiver inputReceiver = new InputReceiver();			
			
			int selectNo = inputReceiver.receiveIntInput("선택 > ");
			
			if (selectNo == MenuSelector.PLUS) {
				System.out.println(selectNo + "번, 덧셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double plusA = inputReceiver.receiveDoubleInput("숫자1 > ");
				double plusB = inputReceiver.receiveDoubleInput("숫자2 > ");
				
				System.out.println(Calculator.plus(plusA, plusB));
			} else if (selectNo == MenuSelector.MINUS) {
				System.out.println(selectNo + "번, 뺄셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double minusA = inputReceiver.receiveDoubleInput("숫자1 > ");
				double minusB = inputReceiver.receiveDoubleInput("숫자2 > ");
				
				System.out.println(Calculator.plus(minusA, minusB));
			} else if (selectNo == MenuSelector.MULTIPLE) {
				System.out.println(selectNo + "번, 곱셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double multipleA = inputReceiver.receiveDoubleInput("숫자1 > ");
				double multipleB = inputReceiver.receiveDoubleInput("숫자2 > ");
				
				System.out.println(Calculator.plus(multipleA, multipleB));
			} else if (selectNo == MenuSelector.DEVIDE) {
				System.out.println(selectNo + "번, 나눗셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double devideA = inputReceiver.receiveDoubleInput("숫자1 > ");
				double devideB = inputReceiver.receiveDoubleInput("숫자2 > ");
				
				System.out.println(Calculator.plus(devideA, devideB));
			} else if (selectNo == MenuSelector.EXIT) {
				System.out.println(SystemMessages.valueOf("SYSTEM_OFF"));
				power = false;
			} else {
				System.out.println(SystemMessages.valueOf("INVALID_INPUT"));
			}
		}
	}
	
}