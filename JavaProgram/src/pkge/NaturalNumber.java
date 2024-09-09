package pkge;
import java.util.*;

public class NaturalNumber {
	int temp,num1,num2;
	
	public void number()
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		num1=sc.nextInt();
		System.out.println("Enter ending number"); 
		num2=sc.nextInt();
		temp=num1;
		while(temp<=num2)
		{
			System.out.println(temp);
			temp++;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("debug example");
		NaturalNumber obj= new NaturalNumber(); 
		obj.number();
		System.out.println("end");
		
		// TODO Auto-generated method stub

	}

}
