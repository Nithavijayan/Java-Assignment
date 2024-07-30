package intrfce.rbi;
import java.util.*;

public class Hdfc implements Rbi
{
	float amount,duration,interest,totalAmt;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter customers --Amount--");
		float amt=sc.nextFloat();
		System.out.println("--Time period-- of Deposit(in years)");
		float period=sc.nextFloat();
		
		Hdfc object=new Hdfc();
		object.recurringDeposit(amt,period);
		object.print();
		
	}
	
	public void recurringDeposit(float amount, float duration) 
	{
		this.amount=amount;
		this.duration=duration;
		
		interest=(amount*duration*R)/100;
		totalAmt=amount+interest;	
	}
	
	public void print()
	{
		System.out.println("your principle amount "+amount+"/-, after "+duration+" years");
		System.out.println(+totalAmt+"/-");
	}	
}
