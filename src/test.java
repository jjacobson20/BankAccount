public class test
{
	public static void main(String[] args)
	{
		BankAccount myAccount = new BankAccount("jeremy", 7);
		myAccount.deposit(40);
		double balance = myAccount.getBalance();
		System.out.println(myAccount);
		System.out.println(balance);
	}
}