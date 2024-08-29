package ch06.easy_bank;

public class Account {
	
	private String accountNumer;
	private String userName;
	private int balance;
	
	public Account (String accountNumber, String userName, int balance) {
		this.accountNumer = accountNumber;
		this.userName = userName;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumer;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumer = accountNumber;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
