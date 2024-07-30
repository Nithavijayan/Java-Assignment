package CollectionPgm;
import java.util.ArrayList;
import java.util.Iterator;

public class Colour 
{
	static ArrayList <String> ls=new ArrayList <String> ();
	
	public void colours()
	{
		ls.add("VIOLET");
		ls.add("INDIGO");
		ls.add("BLUE");
		ls.add("GREEN");
		ls.add("YELLOW");
		ls.add("ORANGE");
		ls.add("RED");
	}
	
	public void iterate()
	{
		System.out.println("---list your colours---");
		Iterator <String> it=ls.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public void remove(String stg)
	{
		ls.remove(stg);
		System.out.println();
		System.out.println("after removing 4th element--");
		for(String st:ls)
			
		System.out.println(st);
	}
	
	public void retrieve(String st)
	{
		System.out.println();
		System.out.println("retrieve 3rd element from the list--"+st);
		System.out.println();
	}
	public void search(String st)
	{
		if(ls.contains(st))
			
				System.out.println("search element exit in the index-- "+st);
		else
			System.out.println("search element doesn't exit in the index");	
	}
	
	public static void main(String[] args) 
	{
		Colour clr=new Colour();
		clr.colours();
		clr.iterate();
		clr.remove(ls.get(3));
		clr.retrieve(ls.get(2));
		clr.search(ls.get(4));
	}
}
