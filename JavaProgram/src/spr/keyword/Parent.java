package spr.keyword;

public class Parent 
{
	int num;
	public Parent(int num)
	{
		this.num=num;
		System.out.println("parent class constructor");
	}
	public void getData()
	{
		System.out.println(+num);
		System.out.println("parent class method");
	}
}
