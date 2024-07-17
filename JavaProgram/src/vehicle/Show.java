package vehicle;

public class Show extends Data
{
	public void dataMethod()
	{
		System.out.println("car model "+model);
		System.out.println("car price "+price);
	}

	public static void main(String[] args) 
	{
		Show obj=new Show();
		obj.input("Nexon");
		obj.get(200000);
		obj.dataMethod();
		// TODO Auto-generated method stub

	}

}
