package abstraction;

public class Child1 extends ParentAbstract
{
	int sum;
	public void number(int num1,int num2)// abstract method implement
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int operation()//abstract method implement
	{
		sum=num1+num2;
		return sum;
		//System.out.println("sum is "+sum);
	}
}
