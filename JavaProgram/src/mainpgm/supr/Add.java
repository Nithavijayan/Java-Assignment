package mainpgm.supr;

public class Add
{
	int num1,num2;
	
	public Add(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void check()
	{
		num1+=num2;
		System.out.println("sum is "+num1);
		//return num1;
	}
}
