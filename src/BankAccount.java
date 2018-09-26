/**
 * 
 * 
 * @author jeremy
 *
 */
public class BankAccount
{
	private String name;
	private int accNum;
	private double balance;
	
	public BankAccount(String inputName, int inputAccNum)
	{
		name = inputName;
		accNum = inputAccNum;
	}
	
	public void deposit(int amount)
	{
		balance += amount;
	}
	
	public void withdraw(int amount)
	{
		balance -= amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return ("Name: " + name + "Account Number: " + accNum + ". Balance: " + balance);
	}
	
}
