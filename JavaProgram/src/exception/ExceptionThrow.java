package exception;

import java.io.IOException;

public class ExceptionThrow {
int result;
	
	public void operation(int num1,int num2) throws IOException
	{
		
		result=num1+num2;
		if(result<60)
			throw new IOException();
		else
			throw new ArithmeticException("else part");
		//System.out.println("result is: "+result);
		
	}
	public void print() throws IOException
	{
		operation(50,10);
	}
	
	public static void main(String[] args)
	{
		ExceptionThrow object= new ExceptionThrow();
		try
		{
		object.print();
		}
		catch(IOException e)
		{
			System.out.println("IO exception propagation");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("arithmetic exception propagation");
		}
		// TODO Auto-generated method stub

	}

}
