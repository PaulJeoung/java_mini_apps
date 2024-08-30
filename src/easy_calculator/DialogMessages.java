package easy_calculator;

public enum DialogMessages {
	
	CALC_RESULT("MSG01", "결과 : "),
	BOARD_LINE("MSG99", "----------------------------------------"),
	MENU_SET("MSG02", "1.덧셈 | 2.뺄셈 | 3.곱셉 | 4.나눗셈 | 5.종료"),
	MENU_SELECT("MSG03", "선택 > "),
	INPUT_VALUE_1("MSG11", "1번째 숫자 > "),
	INPUT_VALUE_2("MSG12", "1번째 숫자 > "),
	EXIT("EXIT", "EXIT");
	
	private final String code;
	private final String message;
	
	private DialogMessages(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return String.format("%s", message);
	}

}
