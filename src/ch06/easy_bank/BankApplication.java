package ch06.easy_bank;

import java.util.Scanner;

public class BankApplication {
	
	private static Scanner input = new Scanner(System.in);
	private static Account[] clientArray = new Account[100];
	static int arrCnt = 0;
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println(" 1.Create Account | 2.Account List | 3.Deposit | 4.Withdraw | 5.Exit ");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Choose > ");
			
			int selectNo = Integer.parseInt(input.nextLine());
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				searchList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else {
				System.out.println("System Exit");
				run = false;
			}
		}
	}
	
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("Create Account : ");
		System.out.println("----------------------");
		
		System.out.println("Account Number : ");
		String accountNo = input.nextLine();
		System.out.println("Account User   : ");
		String accountUser = input.nextLine();
		System.out.println("Set A Balance  : ");
		int balance = Integer.parseInt(input.nextLine());
		
		Account account = new Account(accountNo, accountUser, balance);
		clientArray[arrCnt] = account;
		arrCnt++;
		System.out.println("Report         : Account was creation");
		
	}
	
	private static void searchList() {
		System.out.println("------------");
		System.out.println("계좌 목록");
		System.out.println("------------");
		for (int i=0; i<clientArray.length; i++) {
			Account account = clientArray[i];
			if (account != null) {
				System.out.print(account.getAccountNo() + "\t");
				System.out.print(account.getAccountUser() + "\t");
				System.out.print(account.getBalance() + "\t");
				System.out.println();
			} else {
				break;
			}
		}
	}
	
	private static void deposit() {
		System.out.println("------------");
		System.out.println("예금");
		System.out.println("------------");
		System.out.println("계좌번호 : ");
		String accountNo = input.nextLine();
		System.out.println("예금액 : ");
		int balance = Integer.parseInt(input.nextLine());
		
		Account account = findAccout(accountNo);
		
		if(account != null) {
			account.setBalance(account.getBalance()+balance);
			System.out.println("결과 : 예금이 성공 하였습니다");
		} else {
			System.out.println("결과 :  예금에 실패 하였습니다");
			return;
		}
	}
	
	private static void withdraw() {
		System.out.println("------------");
		System.out.println("출금");
		System.out.println("------------");
		System.out.println("계좌번호 : ");
		String accountNo = input.nextLine();
		System.out.println("예금액 : ");
		int balance = Integer.parseInt(input.nextLine());
		
		Account account = findAccout(accountNo);
		
		if(account != null) {
			account.setBalance(account.getBalance()-balance);
			System.out.println("결과 : 풀금이 성공 하였습니다");
		} else {
			System.out.println("결과 :  출금에 실패 하였습니다");
			return;
		}
	}
	
	private static Account findAccout(String accountNo) {
		Account accout = null;
		for (int i=0; i<clientArray.length; i++) {
			if (clientArray[i] != null) {
				String searchNumber = clientArray[i].getAccountNo();
				if (searchNumber.equals(accountNo)) {
					accout = clientArray[i];
					break;
				}
			}
		}
		return accout;
	}
}