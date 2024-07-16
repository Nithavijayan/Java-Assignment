package inheritance;

public class Child extends Parent {
	
	public void childmethod()
	{
		System.out.println("child class");
		number+=8;
		System.out.println("parent method number in child method "+number);
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.parentmethod(5);
		obj.childmethod();
		
		// TODO Auto-generated method stub

	}

}
