package ch06;

public class Account {

		private int balance;
		static final int MIN_BALANCE = 0;
		static final int MAX_BALANCE = 1000000;
		
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			if(balance < MIN_BALANCE) {
				System.out.println("계좌 잔고는 - (음수)를 받지 않습니다");
				this.balance = MIN_BALANCE;
			} else if (balance > MAX_BALANCE) {
				System.out.println("계좌 잔고는 1,000,000 원이 최대 입니다");
				this.balance = MIN_BALANCE;
			} else {
				this.balance = balance;
			}
		}
}
