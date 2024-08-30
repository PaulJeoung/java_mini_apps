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
		
		for
		
	}
	
	private static void deposit() {
		
	}
	
	private static void withdraw() {
		
	}
	
	private static Account findAccout(String accountNo) {
		Account accout = null;
		for (int i=0; i<clientArray.length; i++) {
			if (clientArray[i] != null) {
				String searchAccountNo = clientArray[i].getAccountNo();
				if (searchAccountNo.equals(accountNo)) {
					accout = clientArray[i];
					break;
				}
			}
		}
		return account;
	}
}