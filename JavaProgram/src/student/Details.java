package student;

public class Details extends Student
{
	public void department()
	{
		System.out.println("student department is "+dept);
	}

	public static void main(String[] args)
	{
		Details obj=new Details();
		obj.getdata("veena",101,450);
		obj.print();
		obj.department();
		// TODO Auto-generated method stub

	}

}
