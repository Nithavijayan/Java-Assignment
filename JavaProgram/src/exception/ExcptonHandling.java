package exception;

public class ExcptonHandling 
{
	int result;
	
	public void operation(int num1,int num2)
	{
		int i;
		int arr[]=new int[5];
		try 
		{
		result=num1/num2;
		System.out.println("result is: "+result);
		for(i=0;i<5;i++)//i<=5 aayirunnu nerathe
		{
			arr[i]=i+1;
			System.out.println(+arr[i]);
		}
	
		}
	/*catch(ArrayIndexOutOfBoundsException ex)// exception message for array
		{
			System.out.println("array size cannot exceed out of 5 ");
		}
	*/	
	catch(ArithmeticException e)//this exception cannot catched bcoz num2 is not zero now
	{
		System.out.println("division by zero is not possible");
	}
		catch(Exception en)// bakki ella exception-num sheshame ee catch ezhuthaavoo, 
		//arry exception commect cheythu so ee exception work aakum .   
		{
	
			System.out.println("exception occured");
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("end");
	}
	public static void main(String[] args)
	{
		ExcptonHandling object= new ExcptonHandling();
		object.operation(50,10);
		// TODO Auto-generated method stub

	}

}
