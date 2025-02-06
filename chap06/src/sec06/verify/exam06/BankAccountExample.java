package sec06.verify.exam06;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount act1 = new BankAccount("이나율", "67749337", 100000);
		BankAccount act2 = new BankAccount("조민호", "52046202", 50000);
		
		act1.balanceInfo();
		act2.balanceInfo();
		
		act1.withdraw(2000000);
		act1.deposit(-10);
		act2.deposit(8000);
		
		act1.withdraw(-5000);
	}

}
