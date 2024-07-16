package multilevel.inheritance;

public class Third extends Second {
	public void thirdmethod()
	{
		System.out.println("third class");
		secondmethod("Arundhathi");
	}

	public static void main(String[] args) {
		Third obj=new Third();
		obj.firstmethod(10,20);
		obj.thirdmethod();
		
		// TODO Auto-generated method stub

	}

}
