package cricket;

public class Runs extends Match 
{
	int runs1,runs2,runs3;
	int total;
	public void data(int runs1,int runs2,int runs3)
	{
		this.runs1=runs1;
		this.runs2=runs2;
		this.runs3=runs3;
	}
	public void add()
	{
		total=runs1+runs2+runs3;
		System.out.println("total runs "+total);
	}
}
