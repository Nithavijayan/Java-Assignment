package interfce.pkge;

public class IntrfceClass implements Intrface3// this interface also extends another 2 interfaces
{ 
	int num;
		

	@Override
	public void operation(int num) 
	{
		
	    this.num=num*NUM;
		System.out.println("interface method implementation");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() 
	{
		System.out.println("product is "+num);
		
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void getData() 
	{
		System.out.println("intrfce2 method");
		System.out.println("intrfce1 method variable "+NUM);
		// TODO Auto-generated method stub
		
	}
	
	public void method()
	{
		System.out.println("this is class method");
	}
	public static void main(String[] args) 
	{
		IntrfceClass obj=new IntrfceClass();
		obj.operation(10);
		obj.display();
		obj.method();
		obj.getData();
		obj.addition();
	}

	@Override
	public void addition() 
	{
		System.out.println("intrfce3 method");	
		// TODO Auto-generated method stub
		
	}

	
}
