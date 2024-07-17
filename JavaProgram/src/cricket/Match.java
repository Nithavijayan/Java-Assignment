package cricket;

public class Match extends Player
{
	String ipl;
	public void input(String ipl)
	{
		this.ipl=ipl;
		System.out.println("Your "+ipl);
		
	}
	
		public static void main(String[] args)
		{
			Match obj=new Match();
			Runs obj1=new Runs();
			Runs object=new Runs();
			
			obj.info("Sachin");
			obj.input("first ipl");
			object.data(110,148,231);
			object.add();
			
			System.out.println();
			
			obj.info("Dhoni");
			object.input("third ipl");
			obj1.data(150,200,210);
			obj1.add();
			
			// TODO Auto-generated method stub
		}
}
