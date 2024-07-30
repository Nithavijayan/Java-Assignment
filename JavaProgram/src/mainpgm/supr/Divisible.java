package mainpgm.supr;

public class Divisible extends Add
{
	public Divisible()
	{
		super(50,32);
	}
	
	public void check()
	{
		super.check();
		
		//int value=super.check();// vere method name aanenkil ingane return cheyyam parent il ninnum
		
		//if(super.check()%10==0)
			
		if(num1%10==0)
			System.out.println("number is divisible by 10");
		else
			System.out.println("number is not divisible by 10");
	}

	public static void main(String[] args) 
	{
		Divisible obj=new Divisible();
		obj.check();
	}

}
