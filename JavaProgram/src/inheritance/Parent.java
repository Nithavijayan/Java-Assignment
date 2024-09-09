package inheritance;

public class Parent {
	int number;
	public void parentmethod(int num)
	{	
		number=num;
		num+=2;
	System.out.println("Parent class");
	System.out.println("number in parent method "+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
