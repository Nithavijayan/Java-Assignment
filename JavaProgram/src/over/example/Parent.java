package over.example;

public class Parent
{
	int number=10;
	public void getMethod()
	{
		number++;
		System.out.println("parent number "+number);
	}
	public void print()
	{
		getMethod();
		System.out.println("your number "+number);
	}
}
