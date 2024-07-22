package encapsulation;

public class Bank
{
	private float  balance;
	private String name;
	final float I=7.3f;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void calculate()
	{
		float interest=((balance*2*I)/100);
		balance=balance+interest;
		System.out.println("your interest: "+interest);
		
	}
}
