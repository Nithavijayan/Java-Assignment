package keyword.spr;

public class ChildSuper extends ParentSuper
{
	int num;
	
	public ChildSuper(int n1)
	{	
		super.num=n1; //parent te num lekku assign cheithu
		num=n1;// child te num lekku assign cheithu
		display();         //child method executed
		super.display();// parent method executed
	}
	public void display()
	{
		System.out.println("child number "+num);
		System.out.println("parent number "+super.num);
		
	}
	

	public static void main(String[] args)
	{
		ChildSuper obj=new ChildSuper(30);
		//obj.method();
		//obj.display();
		// TODO Auto-generated method stub

	}

}
