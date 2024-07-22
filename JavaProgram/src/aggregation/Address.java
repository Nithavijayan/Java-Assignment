package aggregation;

public class Address 
{
	private String houseName;
	private int houseNo;
	private String street;
	private Student stud;//classname(datatype) variable; has-a relationship(aggregation)
	
	public Address(String houseName,int houseNo,String street, Student stud)
	{
		this.houseName=houseName;
		this.houseNo=houseNo;
		this.street=street;
		this.stud=stud;
	}
	
	public void print()
	{
		System.out.println("student name "+stud.getName());
		System.out.println("student rollno "+stud.getRollno());
		System.out.println("student house name "+houseName);
		System.out.println("student house number "+houseNo);
		System.out.println("student house street "+street);
	}
	public static void main(String[] ags)
	{
		
		//creating main() in next class StudentDetails
		}
}
