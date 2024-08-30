package easy_calculator;

public enum SystemMessages {
	INVALID_INPUT("EM01", "유효하지 않은 입력값 입니다"),
	INCORRECT_RESULT("EM02", "잘못된 계산 결과 입니다"),
	INVALID_INPUT_INT("TE01", "입력값은 INT 형이 아닙니다"),
	INVALID_INPUT_DOUBLE("TE02", "입력값은 DOUBLE 형이 아닙니다"),
	INVALID_INPUT_STRING("TE03", "입력값은 STRING 형이 아닙니다"),
	SYSTEM_ON("SYS1", "전원을 켭니다"),
	SYSTEM_OFF("SYS2", "전원을 끕니다"),
	SYSTEM_OPERATING("SYS9", "전원이 켜져 있습니다");
	
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
		return String.format("%s | %s", code, message);
	}
	
}
