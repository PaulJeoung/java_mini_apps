/* 
 * Author        : pj
 * Class Name    : System.java
 * modified date : 2024-08-29
 * description   : 계산기 전원 ON/OFF
 * */

package easy_calculator;

//import java.util.Scanner;
import easy_calculator.SystemMessages;
import easy_calculator.MenuSelector;
import easy_calculator.Calculator;
import easy_calculator.InputReceiver;


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
			System.out.println(DialogMessages.valueOf("BOARD_LINE"));
			System.out.println(DialogMessages.valueOf("MENU_SET"));
			// System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셉 | 4.나눗셈 | 5.종료");
			
			InputReceiver inputReceiver = new InputReceiver();
			
			int selectNo = inputReceiver.receiveIntInput(DialogMessages.valueOf("MENU_SELECT"));
			
			switch (selectNo) {
			
			case MenuSelector.PLUS:
				System.out.println(selectNo + "번, 덧셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double plusA = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				double plusB = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				
				System.out.println(Calculator.plus(plusA, plusB));
				
			case MenuSelector.MINUS:
				System.out.println(selectNo + "번, 뺄셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double minusA = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				double minusB = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				
				System.out.println(Calculator.plus(minusA, minusB));
				
			case MenuSelector.MULTIPLE:
				System.out.println(selectNo + "번, 곱셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double multipleA = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				double multipleB = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				
				System.out.println(Calculator.plus(multipleA, multipleB));
			
			
			case MenuSelector.DEVIDE:
				System.out.println(selectNo + "번, 나눗셈을 하겠습니다. 차례대로 2개의 숫자를 넣으세요");
				double devideA = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				double devideB = inputReceiver.receiveDoubleInput(DialogMessages.valueOf("INPUT_VALUE_1"));
				
				System.out.println(Calculator.plus(devideA, devideB));
				
			case MenuSelector.EXIT:
				System.out.println(SystemMessages.valueOf("SYSTEM_OFF"));
				power = false;
				
			default:
				System.out.println(SystemMessages.valueOf("INVALID_INPUT"));
			}
		}
	}
	
}