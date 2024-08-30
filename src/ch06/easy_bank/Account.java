package ch06.easy_bank;

public class Account {

	private String accountNo;
	private String accountUser;
	private int balance;
	
	public Account (String accountNo, String accountUser, int balance) {
		this.accountNo = accountNo;
		this.accountUser = accountUser;
		this.balance = balance;
	}
	
	String getAccountNo() {
		return accountNo;
	}
	String getAccountUser() {
		return accountUser;
	}
	int getBalance() {
		return balance;
	}
	void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	void setAccountUser(String accountUser) {
		this.accountUser = accountUser;
	}
	void setBalance(int balance) {
		this.balance = balance;
	}
}