package abstrtion.program;

//import java.util.Scanner;

public class AbstractionChild extends AbstractionParent {

	int number3;
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter two numbers");
		//int n1=sc.nextInt();
		//int n2=sc.nextInt();
		AbstractionChild child=new AbstractionChild();
		child.operation();
		// TODO Auto-generated method stub

	}

	@Override
	public void operation() 
	{
		//this.number1=number1;
		//this.number2=number2;
	    number3=number1+number2;
		System.out.println("sum is : "+number1);
		// TODO Auto-generated method stub
		
	}

}
