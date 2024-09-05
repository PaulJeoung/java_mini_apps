package easy_lsm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {
	
	HashMap<String, String> map = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	
	private String userName;
	private String userPhoneNumber;
	
	public void inputData () {
		System.out.println("이름을 입력 하세요 > ");
		userName = scanner.next();
		scanner.nextLine();
		System.out.println("연락처를 입력 하세요 > ");
		userPhoneNumber = scanner.nextLine();
		setContacts(userName, userPhoneNumber);
	}
	
	public HashMap<String, String> setContacts(String userName, String userPhoneNumber) {
		map.put(userPhoneNumber, userName);
		return map;
	}
	
	public void getContacts() {
		System.out.println("연락처 확인을 위한 이름을 입력해 주세요 > ");
		userName = scanner.next();
		scanner.nextLine();
		boolean hasValue = map.containsValue(userName);
		if (hasValue == true) {
			for (Map.Entry<String, String> entry : map.entrySet()) {
				if (entry.getValue().equals(userName)) {
					System.out.println(userName + " : " + entry.getKey());
				}
			}			
		}
	}
}
