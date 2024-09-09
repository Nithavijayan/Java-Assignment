package over.example;

public class Child extends Parent
{
	
	public void getData()
	{
		number+=30;
	}
	public void print()
	{
		getData();
		System.out.println("child number "+number);
	}

	public static void main(String[] args) 
	{
		//Child obj=new Child();
		//obj.print();// child te overriding method execute aakum
		

		//Parent obj1=new Parent();
		//obj1.print();// parent le overriding method execute aakum
		
		Parent obj=new Child();// parent nu aanu object create aakunnathu
		obj.getMethod(); //parent method maathram call cheyyam
		obj.print();// but =new Child(); so, child le override aakki ezhuthiya method maathram call aakum.
	}

}
