/* 
 * Author        : pj
 * Class Name    : DisplayFormat.java
 * modified date : 2024-08-29
 * description   : Calculator.class 의 계산 결과의 자릿수를 처리
 * */

package easy_calculator;

public class DisplayMessages {
	
	public enum ErrorCode {
		INVALID_INPUT("E001", "유효하지 않은 입력 입니다"),
		INCORRECT_RESULT("E002", "잘못된 계산 결과 입니다");
	}
	public enum SystemCode {
		CALC_RESULT("M001", "결과 : "),
		SYSTEM_ON("S001", "전원을 켭니다"),
		SYSTEM_OFF("S002", "전원을 끕니다"),
		SYSTEM_OPERATING("S000", "전원이 켜져 있습니다");
		
	}
	
//	String resultCalc = "결과 : ";
//	String errorValue = "잘못된 입력값 입니다";
//	String errorResult = "잘못된 계산 결과 입니다";
//	String errorSelector = "사칙연산 번호를 잘못 입력 했습니다";
//	String systemOnMsg = "전원을 켭니다";
//	String systemOffMsg = "전원을 끕니다";
//	String systemStatusMsg = "전원이 켜져 있습니다";
	
}
