package employees;
import java.util.Scanner;

public class EmployeeDetails extends Company
{
	final int HOUR=8;
	
	public void calculateSalary()
	{
		payment=amount*HOUR;
		System.out.println("salary of full time employee-- "+payment);
	}

	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter part time employee working hours");
		float hr=sc.nextFloat();
		EmployeeDetails obj=new EmployeeDetails();
		Contractor obj1=new Contractor(hr);
		obj1.calculateSalary();
		obj.calculateSalary();
			
	}
}
