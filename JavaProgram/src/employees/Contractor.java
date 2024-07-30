package employees;

public class Contractor extends Company
{
	float hour;
	
	public Contractor(float hour)
	{
		this.hour=hour;
	}
	
	
	public void calculateSalary()
	{
		payment=amount*hour;
		System.out.println("salary of part time employee-- "+payment);
	}
}
