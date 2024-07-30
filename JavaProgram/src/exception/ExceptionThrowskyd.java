package exception;

public class ExceptionThrowskyd 
{
int result;
	
	public void operation(int num1,int num2) throws ArithmeticException
	{
		try 
		{
		result=num1/num2;
		
		System.out.println("result is: "+result);
		}
		catch(ArithmeticException e)//this exception cannot catched bcoz num2 is not zero now
		{
			System.out.println("division by zero is not possible");
		}
	}
	
	public static void main(String[] args)
	{
		ExceptionThrowskyd object= new ExceptionThrowskyd();
		object.operation(50,10);
		// TODO Auto-generated method stub

	}

}
