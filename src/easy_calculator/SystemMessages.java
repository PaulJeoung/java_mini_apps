package easy_calculator;

public enum SystemMessages {
	INVALID_INPUT("E001", "유효하지 않은 입력 입니다"),
	INCORRECT_RESULT("E002", "잘못된 계산 결과 입니다"),
	CALC_RESULT("M001", "결과 : "),
	SYSTEM_ON("S001", "전원을 켭니다"),
	SYSTEM_OFF("S002", "전원을 끕니다"),
	SYSTEM_OPERATING("S000", "전원이 켜져 있습니다");
	
	private final String code;
	private final String message;
	
	private SystemMessages(String code, String message) {
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
		return String.format("Code : %s | %s", code, message);
	}
	
}
