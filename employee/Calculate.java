package employee;

public class Calculate extends GetData
{ 
	double hra;
	double pf;
	String name;
	int id;
	public void operation(String name,int id)
	{
		this.name=name;
		this.id=id;
		hra=(basicPay*5)/100;
		pf=(basicPay*20)/100;
		System.out.println("Employee name : "+name);
		System.out.println("Employee id : "+id);
	} 
}