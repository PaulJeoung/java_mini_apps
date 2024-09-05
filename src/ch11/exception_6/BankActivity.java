package ch11.exception_6;

public class BankActivity {
	public static void main (String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금 : "+account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
