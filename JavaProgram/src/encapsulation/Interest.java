package encapsulation;

public class Interest 
{

	public static void main(String[] args) 
	{
		Bank obj=new Bank();
		obj.setName("xyz");
		obj.setBalance(5000);
		obj.calculate();
		float bal=obj.getBalance();
		System.out.println("your balance: "+bal);
		System.out.println("your name "+obj.getName());
		// TODO Auto-generated method stub

	}

}
