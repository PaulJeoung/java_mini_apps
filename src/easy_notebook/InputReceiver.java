package easy_notebook;

import java.util.Scanner;

public class InputReceiver {
	
	private Scanner scanner; // 필드 선언
	
	public InputReceiver(Scanner scanner) { // 생성자 선언
		this.scanner = new Scanner(System.in);
	}
	
	// 데이터 받을 메소드 선언
	public String receiveStringInput() {
		return scanner.nextLine();
	}
	public int receiveIntInput() {
		return scanner.nextInt();
	}
	public void close() {
		scanner.close();
	}
}
