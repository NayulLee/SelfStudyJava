package sec06.verify.exam06;

public class BankAccount {
	// 필드(이름, 계좌번호, 잔액)
	private String accountName;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String accountName, String accountNumber, int balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(int num) {
		if(num < 0) {
			System.out.println("잘못된 금액 입력");
			return;
		}
		else {
			balance += num;
			System.out.println(num + "원 입금 완료");
			balanceInfo();
		}
	}
	
	public void withdraw(int num) {
		if(balance - num < 0 || num < 0) {
			System.out.println("출금 불가.");
			balanceInfo();
			return;
		}
		else {
			balance -= num;
			System.out.println(num + "원 출금 완료");
			balanceInfo();
		}
	}
	
	public void balanceInfo() {
		System.out.println(accountName + "님의 잔액 : " + balance);
	
	}
}
