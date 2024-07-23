package abstraction;

public abstract class ParentAbstract 
{
	int num1,num2;
	public void display()
	{
		System.out.println("hello");
	}
	public abstract void number(int num1,int num2);
	
	public abstract int operation();
}
