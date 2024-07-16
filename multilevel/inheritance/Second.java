package multilevel.inheritance;

public class Second extends First {
	String name;
	public void secondmethod(String name)
	{
		this.name=name;
		System.out.println("My name is "+name);
		num1+=num2;
		System.out.println("second class "+num1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
