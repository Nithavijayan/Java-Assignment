package employee;

public class Salary extends Calculate 
{
	double finalSalary;
	
	public void finalmethod()
	{
		finalSalary=(basicPay+hra-pf-deduction+bonus);
		 System.out.println("--Basic Pay : "+basicPay);
		 System.out.println("--Deduction : "+deduction);
		 System.out.println("--Bonus : "+bonus);
		 System.out.println("--House Rent allowance : "+hra);
		 System.out.println("--Provident fund : "+pf);
		 System.out.println("--Total salary by hand : "+finalSalary);
	}

	public static void main(String[] args) 
	{	
		Salary obj=new Salary();
		obj.data(25000.3,900.5,1500.9);
		obj.operation("Arjun", 101);
		System.out.println();
		System.out.println("---Salary Slip---");
		obj.finalmethod();
				
		// TODO Auto-generated method stub

	}
	//basic pay, deduction, hra, pf, bonus and total salary by hand
	}


