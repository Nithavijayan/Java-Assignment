package aggregation.program;

public class Details 
{
	String houseName;
	int houseNumber;
	Student data;
	
	public void houseDetails(String houseName,int houseNumber,Student data)
	{
		System.out.println("student name : "+data.name);
		System.out.println("student roll number : "+data.number);
		System.out.println("student house name : "+houseName);
		System.out.println("student house number : "+houseNumber);
	}
	

	public static void main(String[] args) 
	{
		Student student=new Student();
		student.details("arundhathi", 101);
		Details obj=new Details();
		obj.houseDetails("sopanam",1532,student);
		// TODO Auto-generated method stub

	}

}
