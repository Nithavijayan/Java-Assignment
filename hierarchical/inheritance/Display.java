package hierarchical.inheritance;

public class Display extends Parent
{
	public void display()
	{
		System.out.println("student name "+name);
		System.out.println("student id "+id);
		System.out.println("String dept "+dept);
	}
	public static void main(String[] args)
	{
		Display obj=new Display();
		obj.data("Meenakshi",28);
		obj.item("GEOGRAPHY");
		
		Print obj1=new Print(); // same package so object vechu call cheyyam
		obj1.item("SOCIOLOGY");
		obj1.data("Arun",36);
		obj.display();
		obj1.display();
	}
	
}
