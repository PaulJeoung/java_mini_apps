package ch06.easy_bank;

import java.util.Scanner;

public class BankApplication {
	private static Scanner inputScanner = new Scanner(System.in);
	private static Account[] accountMembers = new Account[100];
	public static void main(String[] args) {
		
		boolean run = true;
		
		System.out.println("------------------------------------------------------");
		System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 | 6.메뉴보기 ");
		System.out.println("------------------------------------------------------");
		
		while(run) {
			System.out.println("선택 > ");
			int selectMenu = Integer.parseInt(inputScanner.nextLine());
			
			if (selectMenu == 1) {
				System.out.println("계좌생성");
				System.out.println("---------------");
				createAccount();
				
			} else if (selectMenu == 2) {
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				findAccount();
				
			} else if (selectMenu == 3) {
				System.out.println("---------------");
				System.out.println("예금");
				System.out.println("---------------");
				deposit();
				
			} else if (selectMenu == 4) {
				System.out.println("---------------");
				System.out.println("출금");
				System.out.println("---------------");
				withdraw();
				
			} else if (selectMenu == 5) {
				System.out.println("프로그램 종료");
				run = false;
				
			} else {
				System.out.println("------------------------------------------------------");
				System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 | 6.메뉴보기 ");
				System.out.println("------------------------------------------------------");
			}
		}
		
	} // main 메서드
	
	private static void createAccount() {
		System.out.println("계좌 생성을 위한 정보를 입력해 주세요");
		System.out.println("----------------------------");
		System.out.println("계좌번호 > ");
		String numberAccount = inputScanner.nextLine();
		System.out.println("계좌주(이름) > ");
		String name = inputScanner.nextLine();
		System.out.println("초기입금액 > ");
		int balance = Integer.parseInt(inputScanner.nextLine());
		
		for (int i=0; i<accountMembers.length; i++) {
			if (accountMembers[i] == null) {
				Account newAccount = new Account(numberAccount, name, balance);
				accountMembers[i]= newAccount;
					
				findAccount();
				System.out.println("\n결과 : 계좌가 생성되었습니다");
				break;
			}
		}
	}
	private static void findAccount() {
//		System.out.println("조회 하고자 하는 계좌 번호나 예금주(이름)을 넣어 주세요");
//		System.out.println("입력 > ");
//		String value = inputScanner.next();
		
		for (int i=0; i<accountMembers.length; i++) {
			Account account = accountMembers[i];
			if(account != null) {
				System.out.println("계좌번호 | 예금주 | 잔액");
				System.out.print(account.getAccountNumber() + " | ");
				System.out.print(account.getUserName() + " | ");
				System.out.print(account.getBalance() + " | \n");
				
			}
		}
	}
	private static void deposit() {
		System.out.println("계좌 번호를 넣어 주세요");
		System.out.println("입력 > ");
		String value = inputScanner.next();
		Account account = searchAccount(value);
//		for (int i=0; i<accountMembers.length; i++) {
//			Account account = accountMembers[i];
//			if(value.equals(account.getAccountNumber())) {
////			if(account.getAccountNumber().equals(value)) {
//				System.out.println("계좌번호 | 예금주 | 잔액");
//				System.out.print(account.getAccountNumber() + " | ");
//				System.out.print(account.getUserName() + " | ");
//				System.out.print(account.getBalance() + " | \n");
//			} else {
//				System.out.println("입력하신 계좌 번호가 맞지 않습니다");
//				break;
//			}
//		}
	}
	private static void withdraw() {
		
	}
	private static dbAccount searchAccount(String accountNumber) {
		dbAccount account = null;
		for (int i=0; i<accountMembers.length; i++) {
			if (accountMembers[i] != null) {
				String dbAccountNumber = accountMembers[i].getAccountNumber();
				if (dbAccountNumber.equals(accountNumber)) {
					account = accountMembers[i];
					break;
				}
			}
		}
	}
}
