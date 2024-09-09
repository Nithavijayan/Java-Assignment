package spr.keyword;

public class Child extends Parent
{
	//int num;
	public Child()
	{
		super(501);//immediate parent class
		//this.num=num;
		System.out.println("child class constructor");
	}
	public void getMethod()
	{
		//System.out.println(+num);
		System.out.println("child class method");
		
	}
	public static void main(String[] args) 
	{
		Child child=new Child();
		child.getData();
		child.getMethod();
		
		// TODO Auto-generated method stub

	}

}
