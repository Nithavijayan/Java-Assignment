package student;

public class Student 
{
	String name;
	int id;
	int total;
	String dept="Computer Science";
	public void getdata(String name,int id,int total)
	{
		this.name=name;
		this.id=id;
		this.total=total; 
	}
	public void print()
	{	
		System.out.println("student name "+name);
		System.out.println("student id "+id);
		System.out.println("student total mark "+total);
		
	}

}
