package abstraction;

public class Child2 extends ParentAbstract
{
	int product;
	
	public void number(int num1,int num2)//  abstract(parameterized) method implementation
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int operation()//no argument abstract method implement
	{
		product=num1*num2;
		return product;
		//System.out.println("product is "+product);
	}

	public static void main(String[] args) 
	{
		Child1 object=new Child1();
		object.display();
		object.number(10,20);
		int sm=object.operation();
		System.out.println("sum is "+sm);
		
		
		Child2 obj=new Child2();
		obj.display();
		obj.number(23,10);
		int pd=obj.operation();
		System.out.println("product is "+pd);
		// TODO Auto-generated method stub

	}

}
