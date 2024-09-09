package list.program;

import java.util.ArrayList;
import java.util.Iterator;

public class ListData 
{

	static ArrayList<String> ls=new ArrayList <String> ();
	
	public void elements()
	{
		ls.add("violin");
		ls.add("guitar");
		ls.add("flute");
		ls.add("piano");
		System.out.println(ls);
	}
	
	public void iterate()
	{
		
		Iterator <String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public void search(String element)
	{
		if(ls.contains(element))
			System.out.println("element occur in list "+element);
		else
			System.out.println("element not occur in list");		
	}

	public static void main(String[] args)
	{
		ListData data=new ListData();
		data.iterate();
		data.search(ls.get(2));
		// TODO Auto-generated method stub

	}

}
